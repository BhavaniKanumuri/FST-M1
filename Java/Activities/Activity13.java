package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		Random indexGen=new Random();
		
		System.out.println("Enter the integer values: ");
		System.out.println("(EOF or non-Integer to terminate");
		
		while(scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		Integer nums[]=list.toArray(new Integer[0]);
		int index=indexGen.nextInt(nums.length);
		
		System.out.println("THe index value is: "+ index);
		System.out.println("The value in the array at that index value is: "+ nums[index]);
		scan.close();
	}

}
