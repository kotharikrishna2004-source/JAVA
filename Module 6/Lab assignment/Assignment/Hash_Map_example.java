package Assignment;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Orange");
		System.out.println("Initial HashMap: " + map);
		// Accessing elements
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		
		
		
		
	}

}
