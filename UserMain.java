package first1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UserMain {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("程序开始:");
		User user = new User();
		SetUserName(user);
		SetPassword(user);
		SetEmail(user);
		System.out.println("注册完成");
		
		
		
//		System.out.print("请输入用户名：");
//		while(true){
//			String userName = input.next();
//			if(userNameUtil.isCorUserName(userName.trim())){
//				user.setUserName(userName.trim());
//				break;}
//			else System.out.print("请输入正确格式的用户名：");
//		}
//
//		System.out.print("请输入密码：");
//		while(true){
//			String password = input.next();
//			if(passwordUtil.isCorPassword(password.trim())){
//				user.setPassword(password.trim());
//				break;}
//			else System.out.print("请输入正确格式的密码：");
//		}
//		System.out.println("密码等级为：" +
//				passwordUtil.powerOfPassword(user.getPassword()));	
//		
//		
//		System.out.print("请输入email：");
//		while(true){
//			String email = input.next();
//			if(emailUtil.isCorEmail(email.trim())){
//				user.setPassword(email.trim());
//				break;}
//			else System.out.print("请输入正确格式的email：");
//		}
		
	
	}
	public static void SetUserName(User user){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名：");
		while(true){
			String userName = input.next();
			if(userNameUtil.isCorUserName(userName.trim())){
				user.setUserName(userName.trim());
				break;}
			else System.out.print("请输入正确格式的用户名：");
		}
	}
	
	public static void SetPassword(User user){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入密码：");		
		while(true){
			String password = input.next();
			if(passwordUtil.isCorPassword(password.trim())){	
				System.out.print("请确认密码：");
				while(true){				
					String str = input.next();
					if(password.trim().equals(str.trim())){
						user.setPassword(password.trim());
						break;
					}else System.out.print("两次输入的密码不相同，\n请重新输入：");
				}
				user.setPassword(password.trim());
				break;}
			else System.out.print("请输入正确格式的密码：");
		}
		System.out.println("密码等级为：" +
				passwordUtil.powerOfPassword(user.getPassword()));	
	}
	
	public static void SetEmail(User user){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入email：");
		while(true){
			String email = input.next();
			if(emailUtil.isCorEmail(email.trim())){
				user.setPassword(email.trim());
				break;}
			else System.out.print("请输入正确格式的email：");
		}
	}
}



