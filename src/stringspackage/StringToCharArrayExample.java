package stringspackage;

public class StringToCharArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chAr = new char [4];
		
		chAr[0] = 'a';
		chAr[1]= 'n';
		chAr[2]= 'v';
		chAr[3]='i';
		
		String str1="rushank vemula";
		char [] myCharAr = str1. toCharArray();
		
		for(int i=0;i<myCharAr.length;i++)
		{ System.out.println(myCharAr[i]);
	}

}
}
