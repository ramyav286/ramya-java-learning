package oops.inheritanceconstructors;

public class Parent extends GrandParent {
	
	int parentAge;
	int parentAssets;

	
	Parent(int grandParentAgeFromCaller, int grandParentAssetsFromCaller, int parentAgeFromCaller, int parentAssetsFromCaller){
		super (grandParentAgeFromCaller, grandParentAssetsFromCaller);
		
		parentAge = parentAgeFromCaller;
		parentAssets = parentAssetsFromCaller;
	}
	
	public void getParentAssets() {
		System.out.println("Parent Earning:" + parentAssets);
	}
	
	public void getParentTotalAssets() {
		int totalAssets = parentAssets + grandParentAssets;
		System.out.println("Parent Total Assets are:" + totalAssets);
	}
	
public static void main(String[] args) {
	Parent parent1 = new Parent(75, 1000000, 50, 2000000);
	parent1.getParentAssets();
	parent1.getParentTotalAssets();

	}

}
