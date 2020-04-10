package arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] myArray = {242,286,287,688};
		
		int tempVar=myArray[0];
		
		for (int s=0;s<myArray.length; s++) {
			if(myArray[s]>tempVar) {
				tempVar=myArray[s];
			}
		System.out.println(tempVar);

	}

}
}