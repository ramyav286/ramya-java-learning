package collections.keyvalue;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Double> subctMarksTable = new Hashtable<String, Double>();
		subctMarksTable.put("Telugu", 98.5);
		subctMarksTable.put("English",99.5);
		subctMarksTable.put("Maths",34.5);
		subctMarksTable.put("Science",97.5);
		subctMarksTable.put("Social",99.5);
		
		System.out.println(subctMarksTable);
		subctMarksTable.put("Social",96.5);
		System.out.println(subctMarksTable);
		subctMarksTable.put("Null",96.5);
		System.out.println(subctMarksTable);
		
		

	}

}
