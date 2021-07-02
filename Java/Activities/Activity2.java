package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		//Intialize the array
		int[] arr= {10,77,10,54,-11,10};
		System.out.println("The given array is:"+ Arrays.toString(arr));
		
		//search
		int searchNumber=10;
		int sum=30;
		
		System.out.println("THe result is: "+ result(arr, searchNumber, sum));
	}
	public static boolean result(int[] numbers, int searchNumber, int sum) {
		int initial_sum=0;
		for (int number: numbers) {
			if(number==searchNumber) {
				initial_sum+=searchNumber;
			}
			if(initial_sum>sum) {
				break;
			}
		}
		return initial_sum == sum;
	}

}
