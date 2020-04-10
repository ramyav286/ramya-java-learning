package arrays;

public class SummingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marksAr = new int[6];
		
		marksAr[0]=24;
		marksAr[1]= 02;
		marksAr[2]=87;
		marksAr[3]= 28;
		marksAr[4]=06;
		marksAr[5]=88;
		
		int dumbSum = marksAr[0]+ marksAr[1]+ marksAr[2]+ marksAr[3]+ marksAr[4]+ marksAr[5];
		System.out.println("Dumb Sum"+ dumbSum);
		
		int smartSum = 0;
		int lenArray = marksAr.length;
		for(int s=0; s<lenArray; s++) {
			System.out.println("smart sum before calculation:"+ smartSum);
			System.out.println("marks of current subject:"+ marksAr[s]);
			smartSum = smartSum + marksAr[s];
			System.out.println("smart sum after calculation:"+ smartSum);
			
		}
	}

}
