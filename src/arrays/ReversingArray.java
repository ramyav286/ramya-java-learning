package arrays;

public class ReversingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [] gradesAr = { 's','a','m'};
		
		char[] reversedAr= new char [3];
		
		int lengthOfAr = gradesAr. length;
		
		for (int i=0;i<lengthOfAr;i++) {
			reversedAr [lengthOfAr-i-1]= gradesAr[i];
			
			for (int j=0;j<reversedAr.length;j++ )
			{System.out.println(reversedAr[j]);		}

	}

}
}
