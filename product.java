package first1;

public class product {
	private String name;
	private double price;
	/** ��Ʒ���� */
	private String description;
	/** ��Ʒ���� */ 
	private String[] service;
	
	
	public product(){}
	public product(String name,String description){
		setName(name);
		setDescription(description);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		while(true){
		if(price < 0){System.out.print("������������ȷ�ļ�Ǯ��");continue;}	
		this.price = price;
		break;}
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String[] getService() {
		return service;
	}
	public void setService(String[] service) {
		this.service = service;
	}
	
	
}
