package activities;

import java.util.Arrays;

public class Activity4 {
	public static void main(String[] args) {
		int[] arr= { 8,2,7,6,3};
		sortAscen(arr);
		System.out.println("Array after sorting in ascending order is: "+ Arrays.toString(arr));
		
	}
    public static void sortAscen(int array[]) {
    	int size= array.length,i;
    	
        for (i=1;i< size;i++) {
        	int value=array[i];
        	int j=i-1;
        	
        	while(j>=0 && value< array[j]) {
        		array[j+1]=array[j];
        		--j;
        	}
        	array[j+1]=value;
        }
           
    }
    
}
