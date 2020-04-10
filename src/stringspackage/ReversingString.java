package stringspackage;

public class ReversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="virat kohli";
		String reversedStr="";
		System.out.println(reversedStr);
		
		for(int i=str1.length()-1;i>=0;i--) {
			
			reversedStr=reversedStr+str1.charAt(i);
			System.out.println(reversedStr);
		}

	}

}
