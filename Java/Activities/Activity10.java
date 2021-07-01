package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();
		//Adding objects
		hs.add("A");
		hs.add("D");
		hs.add("R");
		hs.add("M");
		hs.add("B");
		hs.add("S");
		
		System.out.println("The Hash set is: "+ hs);
		System.out.println("The size of the hash set is: "+ hs.size());
		System.out.println("The reomved element is: "+ hs.remove("S"));
		if(hs.remove("Z")) {
			System.out.println("Z is removed from the set");
		}
		else {
			System.out.println("Z is not present in the set");
		}
        System.out.println("Checking if R is present in set:"+ hs.contains("R"));
        System.out.println("The updated hash set is : "+ hs);
	}

}
