package day6.assignment4.LinkedHashMapExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		linkedHashMap.put(1,  "Apple");
		linkedHashMap.put(2,  "Orange");
		linkedHashMap.put(3,  "Banana");
		linkedHashMap.put(4,  "Mango");
		linkedHashMap.put(5,  "Watermelon");
		linkedHashMap.put(6,  "Grapes");
		
		System.out.println("Contents of Hash Map: " + linkedHashMap);
		
		linkedHashMap.remove(3);
		
		System.out.println("Contents of Hash Map: " + linkedHashMap);
		
		System.out.println("Doese it have Apple? : " + linkedHashMap.containsValue("Apple"));
		
		for(Integer key : linkedHashMap.keySet()) {
			System.out.println(key+": \t " + linkedHashMap.get(key));			
		}
		
		linkedHashMap.clear();
		
		System.out.println("Contents of Hash Map: " + linkedHashMap);
		
	}

}
