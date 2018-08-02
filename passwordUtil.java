package first1;

public class passwordUtil {	
	//2/6 ������� ��
	//4/6 ������� ��
	//6/6 ������� ǿ
	/** �ж������Ƿ���ȷ */
	public static boolean isCorPassword(String password){
		boolean isCorrect = true;
		//���̱�����6-18���ַ�֮��
		if(password.length() < 6 || password.length() > 18)return false;
		//�ж�����ķ����Ƿ�Ϸ�
		if(!isCorSymbol(password))return false;
		return isCorrect;
	}
	
	/** �ж�����ǿ�� */
	public static String powerOfPassword(String password){
		String[] power = {"","�������","������� ","�������"};
		int index = 0;
		if(password == null)return power[0];//����Ϊ�շ���""
		if(!isCorPassword(password)){
			System.out.println("���볤������6-18λ֮�䣡");
			return power[0];}
		//����Ϊ����ĸ������
		if(isDigit(password) || isLetter(password))index = 1;
		//����Ϊ�������
		else if(isDigitOrLetter(password) ||
				isDigitOrSymbol(password) || isLetterOrSymbol(password))index = 2;
		//����Ϊ�������
		else if(isContainSymbol(password))index = 3;
	
		return power[index];
	}
	
	
	/** �ж������Ƿ�Ϊ������ */
	public static boolean isDigit(String password){
		for (int i = 0; i < password.length(); i++) {
			//��ĳһ���ַ��������֣��򷵻�false
			if(!(Character.isDigit(password.charAt(i))))return false;
		}
		return true;
	}
	
	/** �ж������Ƿ�Ϊ����ĸ */
	public static boolean isLetter(String password){
		for (int i = 0; i < password.length(); i++) {
			//��ĳһ���ַ�������ĸ���򷵻�false
			if(!(Character.isLetter(password.charAt(i))))return false;
		}
		return true;
	}
	
	/** �ж�����ķ����Ƿ�Ϸ� */
	public static boolean isCorSymbol(String password){
	//��ʱ���ж��Ƿ��кϷ��ַ���"_@#$!"
		String correctArray = "_@#$!";
		for (int i = 0; i < password.length(); i++) {			
		  //���ַ�������ĸ�����ֵĻ�
		  if(!(Character.isLetter(password.charAt(i)) ||
					Character.isDigit(password.charAt(i)))){
			//�������ĸ�ֲ��ǺϷ��ַ����򷵻�false
			if(!(correctArray.contains(Character.toString(password.charAt(i)))))
				return false;}
					
			}//�����߼����ǣ��ַ����� ���� �ֲ��� ��ĸ Ҳ���� �Ϸ��ַ�
			return true;
	}
	
	/** �ж��Ƿ��кϷ��ַ� */
	public static boolean isContainSymbol(String password){
		String correctArray = "_@#$!";
		//�������鿴�Ƿ����ĸ��ַ��Ƿ���
		for (int i = 0; i < password.length(); i++) {
			if(correctArray.contains(Character.toString(password.charAt(i))))return true;
			}
		//����û�з���
		return false;
	}
	
	/** �ж������Ƿ�Ϊ���ֻ���ĸ */
	public static boolean isDigitOrLetter(String password){
		for (int i = 0; i < password.length(); i++) {
			//��ĳһ���ַ���������Ҳ������ĸ���򷵻�false
			if(!(Character.isDigit(password.charAt(i)) ||
					Character.isLetter(password.charAt(i))))return false;
		}
		//��ʱ����ֻ�����ֻ���ĸ������ֻ����������һ�֡�
		return true;
	}
	
	/** �ж������Ƿ�Ϊ��ĸ����� */
	public static boolean isLetterOrSymbol(String password){
		String correctArray = "_@#$!";
		for (int i = 0; i < password.length(); i++) {
			//��ĳһ���ַ����Ƿ���Ҳ������ĸ���򷵻�false
			if(!(Character.isLetter(password.charAt(i)) ||
				correctArray.contains(Character.toString(password.charAt(i)))))
				return false;
		}
		//��ʱ����ֻ�з��Ż���ĸ������ֻ����������һ�֡�
		return true;
	}
	
	/** �ж������Ƿ�Ϊ���ֻ���� */
	public static boolean isDigitOrSymbol(String password){
		String correctArray = "_@#$!";
		for (int i = 0; i < password.length(); i++) {
			//��ĳһ���ַ���������Ҳ���Ƿ��ţ��򷵻�false
			if(!(Character.isDigit(password.charAt(i)) ||
				correctArray.contains(Character.toString(password.charAt(i)))))
				return false;
		}
		//��ʱ����ֻ�����ֻ���ţ�����ֻ����������һ�֡�
		return true;
	}
	
	/** �ж������Ƿ�Ϊ���ֻ���ĸ */
	public static boolean isDigitOrLetterOrSymbol(String password){
		String correctArray = "_@#$!";
		for (int i = 0; i < password.length(); i++) {
			//��ĳһ���ַ��������ֲ�����ĸҲ���Ƿ��ţ��򷵻�false
			if(!(Character.isDigit(password.charAt(i)) ||
				Character.isLetter(password.charAt(i)) ||
				correctArray.contains(Character.toString(password.charAt(i)))))
				return false;
		}
		//��ʱ����ֻ�����ֻ���ĸ����ţ�����ֻ����������һ�֡�
		return true;
	}
	
	
	
}
