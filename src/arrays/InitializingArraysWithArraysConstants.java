package arrays;

public class InitializingArraysWithArraysConstants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] gradesAr= {'k','r','a','v','i'};
		
		int arrayLength= gradesAr.length;
		
		for (int i=0; i<arrayLength;i++) {
			System.out.println(gradesAr[i]);
			
			for (char temp: gradesAr){
				System.out.println(temp);
			}
		}
	}

}
