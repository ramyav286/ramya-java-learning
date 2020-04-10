package stringspackage;

public class PalindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= "believe in yourself";
		
		int strLen = str1.length();
		boolean isPalindrome=true;
		
		for(int i=0;i<strLen/2;i++) {
			
			if (str1.charAt(i)!=str1.charAt(strLen-i-1)) {
				isPalindrome = false;
				break;
			}
		}
		
		if (isPalindrome==true) {
			System.out.println("i am Palindrome");
		} else {
			System.out.println("i am not Palindrome");
		}
	}

}
