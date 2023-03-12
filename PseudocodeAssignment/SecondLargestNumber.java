package Pseudocode.Assignment;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		//Declare the array 
		int[] number= {1,5,9,2,6,3,5,4,8,7};
		//to get size of the array 
		int size = number.length;
		//Sort the array
		Arrays.sort(number);
		int array = number[size-2];
		System.out.println("Second largest number is :"+array);
			
		
	}



}

