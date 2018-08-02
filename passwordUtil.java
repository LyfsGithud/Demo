package first1;

public class passwordUtil {	
	//2/6 ★★☆☆☆☆ 弱
	//4/6 ★★★★☆☆ 中
	//6/6 ★★★★★★ 强
	/** 判断密码是否正确 */
	public static boolean isCorPassword(String password){
		boolean isCorrect = true;
		//长短必须在6-18个字符之间
		if(password.length() < 6 || password.length() > 18)return false;
		//判断密码的符号是否合法
		if(!isCorSymbol(password))return false;
		return isCorrect;
	}
	
	/** 判断密码强度 */
	public static String powerOfPassword(String password){
		String[] power = {"","★★☆☆☆☆","★★★★☆☆ ","★★★★★★"};
		int index = 0;
		if(password == null)return power[0];//密码为空返回""
		if(!isCorPassword(password)){
			System.out.println("密码长度需在6-18位之间！");
			return power[0];}
		//密码为纯字母或纯数字
		if(isDigit(password) || isLetter(password))index = 1;
		//密码为两者组合
		else if(isDigitOrLetter(password) ||
				isDigitOrSymbol(password) || isLetterOrSymbol(password))index = 2;
		//密码为三者组合
		else if(isContainSymbol(password))index = 3;
	
		return power[index];
	}
	
	
	/** 判断密码是否为纯数字 */
	public static boolean isDigit(String password){
		for (int i = 0; i < password.length(); i++) {
			//当某一个字符不是数字，则返回false
			if(!(Character.isDigit(password.charAt(i))))return false;
		}
		return true;
	}
	
	/** 判断密码是否为纯字母 */
	public static boolean isLetter(String password){
		for (int i = 0; i < password.length(); i++) {
			//当某一个字符不是字母，则返回false
			if(!(Character.isLetter(password.charAt(i))))return false;
		}
		return true;
	}
	
	/** 判断密码的符号是否合法 */
	public static boolean isCorSymbol(String password){
	//暂时先判断是否有合法字符："_@#$!"
		String correctArray = "_@#$!";
		for (int i = 0; i < password.length(); i++) {			
		  //当字符不是字母或数字的话
		  if(!(Character.isLetter(password.charAt(i)) ||
					Character.isDigit(password.charAt(i)))){
			//而这个字母又不是合法字符，则返回false
			if(!(correctArray.contains(Character.toString(password.charAt(i)))))
				return false;}
					
			}//整个逻辑就是：字符不是 数字 又不是 字母 也不是 合法字符
			return true;
	}
	
	/** 判断是否含有合法字符 */
	public static boolean isContainSymbol(String password){
		String correctArray = "_@#$!";
		//遍历并查看是否有哪个字符是符号
		for (int i = 0; i < password.length(); i++) {
			if(correctArray.contains(Character.toString(password.charAt(i))))return true;
			}
		//发现没有符号
		return false;
	}
	
	/** 判断密码是否为数字或字母 */
	public static boolean isDigitOrLetter(String password){
		for (int i = 0; i < password.length(); i++) {
			//当某一个字符不是数字也不是字母，则返回false
			if(!(Character.isDigit(password.charAt(i)) ||
					Character.isLetter(password.charAt(i))))return false;
		}
		//此时密码只有数字或字母，或者只含《有其中一种》
		return true;
	}
	
	/** 判断密码是否为字母或符号 */
	public static boolean isLetterOrSymbol(String password){
		String correctArray = "_@#$!";
		for (int i = 0; i < password.length(); i++) {
			//当某一个字符不是符号也不是字母，则返回false
			if(!(Character.isLetter(password.charAt(i)) ||
				correctArray.contains(Character.toString(password.charAt(i)))))
				return false;
		}
		//此时密码只有符号或字母，或者只含《有其中一种》
		return true;
	}
	
	/** 判断密码是否为数字或符号 */
	public static boolean isDigitOrSymbol(String password){
		String correctArray = "_@#$!";
		for (int i = 0; i < password.length(); i++) {
			//当某一个字符不是数字也不是符号，则返回false
			if(!(Character.isDigit(password.charAt(i)) ||
				correctArray.contains(Character.toString(password.charAt(i)))))
				return false;
		}
		//此时密码只有数字或符号，或者只含《有其中一种》
		return true;
	}
	
	/** 判断密码是否为数字或字母 */
	public static boolean isDigitOrLetterOrSymbol(String password){
		String correctArray = "_@#$!";
		for (int i = 0; i < password.length(); i++) {
			//当某一个字符不是数字不是字母也不是符号，则返回false
			if(!(Character.isDigit(password.charAt(i)) ||
				Character.isLetter(password.charAt(i)) ||
				correctArray.contains(Character.toString(password.charAt(i)))))
				return false;
		}
		//此时密码只有数字或字母或符号，或者只含《有其中一种》
		return true;
	}
	
	
	
}
