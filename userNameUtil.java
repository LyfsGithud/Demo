package first1;

public class userNameUtil {
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
