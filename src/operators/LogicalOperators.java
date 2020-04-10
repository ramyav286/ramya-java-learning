package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a = 10;
      int b = 15;
      int c = 5;
      if(a>b&&a>c) {
    	  System.out.println("a is greatest of all");
      }
      if (b>c&&b>a) {
    	  System.out.println("b is greatest of all");
      }
      if(c>a&&c>b) {
    	  System.out.println("c is greatest of all");
      }
      
      boolean isMale = true;
      if(isMale) {
    	  System.out.println("Male");
      } else {
    	  System.out.println("Female");
      }
      if(!isMale) {
    	  System.out.println("Female");
      } else {
    	  System.out.println("Male");
      }
	}

}
