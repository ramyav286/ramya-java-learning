package collections.keyvalue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Double> subctMarksMap = new HashMap<String, Double>();
		
		subctMarksMap.put("Telugu", 98.5);
		subctMarksMap.put("English", 99.5);
		subctMarksMap.put("Maths", 34.5);
		subctMarksMap.put("Science", 97.5);
		subctMarksMap.put("Social", 97.5);
		System.out.println(subctMarksMap);
		
		Double teluguMarks = subctMarksMap.get("Telugu");
		System.out.println(teluguMarks);
		Set<String> subjectSet = subctMarksMap.keySet();
		System.out.println(subjectSet);
		
		for(String subjectKey : subjectSet) {
			System.out.println("Subject is :" + subjectKey + ":");
			System.out.println(subctMarksMap.get(subjectKey));
		}
		subctMarksMap.put("Social", 97.5);
		System.out.println(subctMarksMap);
		subctMarksMap.put("Null", 97.5);
		System.out.println(subctMarksMap);
		
		

	}

}
