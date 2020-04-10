package wraperclasses;

public class NumericalWrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int intVar = 24;
 int intAnotherVar = 02;
 int sum = intVar + intAnotherVar;
 System.out.println(sum);
 
 Integer intWrapperObj = new Integer (24);
 Integer intWrapperObj1 = 5;
 
 int valueInside = intWrapperObj.intValue();
 
 int valueInside1 = intWrapperObj;
 Integer intAnotherWrapperObj = new Integer (02);
 
 Integer intSumWrapperObj = intWrapperObj.intValue() + intAnotherWrapperObj.intValue();
 System.out.println(intSumWrapperObj);
 System.out.println(intSumWrapperObj.doubleValue()+24);
 System.out.println(intSumWrapperObj.toString()+24);
 
 int id = Integer.parseInt("24");
 System.out.println(id);
 
 double doublePrimVar = 24.34;
 Double doubleWrObj = new Double (24.34);
 System.out.println(doubleWrObj.doubleValue());
 System.out.println(doubleWrObj.intValue());
 
 System.out.println(Double.parseDouble("288.06"));
 
 boolean boolPrimVar = true;
 Boolean boolWrObj = new Boolean (true);
 System.out.println(boolWrObj.toString());
 
 String str1 = "false";
 boolean b = Boolean.parseBoolean(str1);
 System.out.println(b);
 
 Double doubObj = Double.parseDouble("24.34");
 int inValue = doubObj.intValue();
 System.out.println(inValue);
 }

}
