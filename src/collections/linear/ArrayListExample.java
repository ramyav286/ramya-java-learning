package collections.linear;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strAr = new String[5];
		List<String> subjectList = new  ArrayList<String>();
		subjectList.add("Telugu");
		subjectList.add("English");
		subjectList.add("Maths");
		subjectList.add("Science");
		subjectList.add("Social");
		
		for (String sub : subjectList) {
			System.out.println(sub);
		}
		int listSize = subjectList.size();
		System.out.println(listSize);
		subjectList.add("Hindi");
		System.out.println(subjectList.get(2));
		
		listSize = subjectList.size();
		System.out.println(listSize);
		
		if(subjectList.isEmpty()==true) {
			System.out.println("list is empty");
		} else {
			System.out.println("list is not empty");
		}
		if (subjectList.contains("Maths")){
			System.out.println("subject is present");
		} else {
			System.out.println("not present");
		}
		System.out.println(subjectList);
		subjectList.remove(5);
		System.out.println(subjectList);
		
		subjectList.add("Social");
		System.out.println(subjectList);
		
		List<Double> markList = new ArrayList<Double>();
		markList.add (99.5);
		markList.add (98.5);
		markList.add (97.5);
				
	}

}
