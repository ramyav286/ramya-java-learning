package arrays;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
  
  int [][] twoDimAr = new int [4] [3];
  
  twoDimAr[0][0]= 54;
  twoDimAr[0][1]= 89;
  twoDimAr[0][2]= 32;
 
  
  
	twoDimAr[1][0]=45;
	twoDimAr[1][1]=23;
	twoDimAr[1][2]=56;
	
	twoDimAr[2][0]=453;
	twoDimAr[2][1]= 242;
	twoDimAr[2][2]=287;
	
	for (int rowLoopVar=0;rowLoopVar<4;rowLoopVar++) {
		System.out.println("current row:"+ rowLoopVar);
		
		for(int colLoopVar=0; colLoopVar<3;colLoopVar++) {
			System.out.println("current column:"+ colLoopVar);
			System.out.println(twoDimAr[rowLoopVar][colLoopVar]);
			
		}
	}

}
}
