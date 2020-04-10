package arrays;

public class MyAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] gradesAr = new char [4];
		
		gradesAr [0]= 'a';
		gradesAr [1]='n';
		gradesAr [2]='v';
		gradesAr[3]='k';
		
		int arrayLength = gradesAr.length;
		for (int i=0;i<arrayLength; i++) {
			System.out.println(gradesAr[i]);
			}
		gradesAr[3]= 'j';
		for(int i=0;i<arrayLength;i++) {
			System.out.println(gradesAr[i]);
		}
	}

}
