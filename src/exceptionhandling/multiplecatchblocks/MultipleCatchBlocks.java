package exceptionhandling.multiplecatchblocks;



public class MultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("program execution started");
		try {
			int c;
			int a = 15;
			int b = 3;
			System.out.println("division operation");
			c = a/b;
			System.out.println("After division operation:" + c);
			int m = 5;
			int n = 10;
			System.out.println("Addition operation");
			int l = m+n;
			System.out.println("Sum:" + 1);
			
System.out.println("final calculated value is :" + c * 1);

System.out.println("program execution needed");

System.out.println("program execution started");

String str = null;
System.out.println("Given String is:" + str);
int len = str.length();

System.out.println("Length of the string is:" + str);

System.out.println(str.charAt(5));

System.out.println(str.substring(8));

System.out.println(str.contains("Ramya"));

System.out.println("program execution ended");

System.out.println("program execution started");

int [] intAr = new int[3];
intAr[0] = 123;
intAr[1] = 23;
intAr[2] = 1123;

int arLen = intAr.length;
System.out.println("Length of Array is ;" + arLen);

System.out.println("Running a for loop to display values present in array");

for (int i =0; i <= arLen; i++) {
	System.out.println(intAr[i]);
}

System.out.println("All elements printed");
		} catch (ArithmeticException e) {
			
			System.out.println("Inside Arithmetic Exception catch block");
			e.printStackTrace();
			
		} catch (NullPointerException e) {
			System.out.println("Inside Null Pointer Exception catch block");
			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside Array Index OutOfBounds Exception catch block");
			e.printStackTrace();
		
} catch (Exception e) {
	System.out.println("Inside parent exception");
	e.printStackTrace();
}
		System.out.println("Program excution Ended");


		}

	}


