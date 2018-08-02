package first1;

import javax.swing.JOptionPane;

public class productBiz {
	public static void main(String[] args){
		int[] count = new int[3];
		double total = 0;
		for (int i = 0; i < count.length; i++) {
			product pro = new product();
			String name = JOptionPane.showInputDialog("请输入商品名称：");
			pro.setName(name);
			String strPrice = JOptionPane.showInputDialog("请输入商品单价：");
			pro.setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("请输入购买的商品数量：");
			count[i] = Integer.parseInt(strCount);
			//累加总价
			total = pro.getPrice() * count[i];
		}
		System.out.println("总价：" + total);
	}
}
