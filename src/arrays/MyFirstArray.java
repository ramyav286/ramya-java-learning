package arrays;

public class MyFirstArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] marksAr = new int[3];
		marksAr[0]= 98;
		marksAr[1]=97;
		marksAr[2]=96;
		
		int arrayLength= marksAr.length;
		System.out.println("Array Length Is:"+ arrayLength);
		
		for (int i=1; i<arrayLength;i++) {
			System.out.println("i value is:" +i);
			System.out.println("value at ith index is:"+ marksAr[i]);
		}

	}

}
