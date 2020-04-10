package oops.inheritanceconstructors;

public class GrandParent {
	
	int grandParentAge;
	int grandParentAssets;
	
	GrandParent (int grandParentAgeFromCaller, int grandParentAssetsFromCaller){
		grandParentAge = grandParentAgeFromCaller;
		grandParentAssets = grandParentAssetsFromCaller;
	}
	
	public void getGrandParentAssets() {
		System.out.println("Grand Parent Assets are:" + grandParentAssets);
	}

}
