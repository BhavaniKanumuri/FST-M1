package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> myList= new ArrayList<String>();
		myList.add("London");
		myList.add("Switzerland");
		myList.add("Germany");
		myList.add("Scotland");
		myList.add("Austria");
		
		System.out.println("THe list is: ");
		for(String s: myList) {
			System.out.println(s);
		}
		System.out.println("The third name in the list is: "+myList.get(2));
		System.out.println("Is Rome in the List: "+myList.contains("Rome"));
		System.out.println("The size of the List is: "+myList.size());
		
		myList.remove("Scotland");
		
		System.out.println("The new size of the List is: "+myList.size());

	}

}
