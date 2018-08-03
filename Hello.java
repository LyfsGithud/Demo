import java.util.*;
public class Hello{

	public static void main(String[] args){
		//这个就完全是master的Hello.java
		System.out.println("测试patch!!");	
		System.out.println("由gitpro的dev修改的");	
		System.out.println("由gitpro的dev修改的");	
		System.out.println("由gitpro的dev修改的");	
		System.out.println("由gitpro的dev修改的");	


		//这回又是Demo改的Hello.java
		//这回又是Demo改的Hello.java
		//这回又是Demo改的Hello.java
		//这回又是Demo改的Hello.java

		
	}
}	

//我就在这里再改一次
class userBiz {	
	//2/6 ★★☆☆☆☆ 弱
	//4/6 ★★★★☆☆ 中
	//6/6 ★★★★★★ 强
	/** 判断用户名是否正确 */
	public static boolean isCorUserName(String userName){
		boolean isCorrect = true;
		//用户名最多25个字符
		if(userName == null)isCorrect = false;
		if(userName.length() > 25)isCorrect = false;
		//不能包含特殊符号
		char[] errArray = {' ','\'','"','?'};
		for(char ch : errArray){
		if(userName.contains(Character.toString(ch)))
			isCorrect = false;				
		}
		return isCorrect;
	}	
}
	