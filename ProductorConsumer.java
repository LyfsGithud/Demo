package first1;

public class ProductorConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasketStack basket = new BasketStack();
		Thread pro = new Thread(new Productor(basket));
		Thread con = new Thread(new Consumer(basket));
		pro.start();
		con.start();
	}

}

class ManTou{
	private int id = 0;
	public ManTou(int id){
		this.id = id;
	}
	public int getId() {
		return id;
	}	
}

class BasketStack{
	public int index = 0;
	ManTou[] arrMT = new ManTou[6];
			
	public synchronized void push(ManTou mt){
		while(index == arrMT.length)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.notify();
		arrMT[index] = mt;
		index++;
	}
	
	public synchronized ManTou pop(){
		while(index == 0)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.notify();
		index--;
		return arrMT[index];
	}
}

class Productor implements Runnable{
	BasketStack bs = null;
	
	public Productor(BasketStack bs){
		this.bs = bs;
	}
	
	public void run(){
		for (int i = 0; i < 100; i++) {
			bs.push(new ManTou(i+1));
			System.out.println("放了做好的第" + (i+1) + "个馒头");
		}
		
	}
}

class Consumer implements Runnable{
	BasketStack bs = null;
	
	public Consumer(BasketStack bs){
		this.bs = bs;
	}
	
	public void run(){
		for (int i = 0; i < 100; i++) {	
			ManTou mt = bs.pop();
			System.out.println("吃了做好的第" + mt.getId() + "个馒头");
		}
	}
}

