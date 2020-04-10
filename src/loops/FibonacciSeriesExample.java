package loops;

public class FibonacciSeriesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int firstNumber = 1;
  int secondNumber = 2;
  System.out.println(firstNumber);
  System.out.println(secondNumber);
  
  int thirdNumber;
  for (int i=0;i<24;i++) {
	  System.out.println("First Number Is :" + firstNumber);
	  System.out.println("Second Number Is :" + secondNumber);
	  
	  thirdNumber = firstNumber + secondNumber;
	  System.out.println("Third Number Is :" + thirdNumber);
	  firstNumber = secondNumber;
	  secondNumber = thirdNumber;
	  
	  
  }
  
	}

}
