package stringspackage;

public class StringArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [] strAr = new String[4];
		
		strAr[0]= "anvi";
		strAr[1]="sam";
		strAr[2]= "rushank";
		strAr[3]= "ramya";
		
		for (int v=0;v<strAr.length;v++) {
			System.out.println(strAr[v]);
			
			for (int i=0;i<strAr.length;i++) {
				String tempStr=strAr[i];
				System.out.println(tempStr);
				System.out.println(tempStr.length());
				System.out.println(tempStr.substring(2));
				}
			}
	}

}
