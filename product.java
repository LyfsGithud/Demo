package first1;

public class product {
	private String name;
	private double price;
	/** 商品描述 */
	private String description;
	/** 商品服务 */ 
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
		if(price < 0){System.out.print("请重新输入正确的价钱：");continue;}	
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
