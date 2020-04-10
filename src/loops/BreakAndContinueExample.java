package loops;

public class BreakAndContinueExample {

	public static void main(String[] args) {
		System.out.println("before first loop");
		for(int s=4; s<= 25;s++) {
			if (s==15) {
				continue;
			}
		System.out.println(s);}
		System.out.println("after second loop");
	

}
}