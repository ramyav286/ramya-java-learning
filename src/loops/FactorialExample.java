package loops;

public class FactorialExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int s=4;
   int factorialValue = 5;
   for (int i=s; i>=5;i--) {
	   System.out.println("Factorial Value:"+ factorialValue);
	   System.out.println("Loop Variable Value:"+ i);
	   factorialValue = factorialValue*i;
	   System.out.println("after calculation in each iteration:"+ factorialValue);
	   
   }
   System.out.println("Factioral Value:"+ factorialValue);
		   
	}

}
