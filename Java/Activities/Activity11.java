package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		HashMap<Integer, String> hash_map=new HashMap<Integer, String>();
		hash_map.put(1, "Yellow");
		hash_map.put(2, "White");
		hash_map.put(3, "Blue");
		hash_map.put(4, "Green");
		hash_map.put(5, "Brown");
		
		System.out.println("THe hash map set is: "+ hash_map);
		hash_map.remove(5);
		System.out.println("After removing Brown is: "+ hash_map);
		
		//Check if green exists
		if(hash_map.containsValue("Green")) {
			System.out.println("Green exists in the map");
		}else {
			System.out.println("Green doesnot exist in the map");
		}
		
		//Print the size
		System.out.println("The size of the map is: "+ hash_map.size());

	}

}
