package Pseudocode.Assignment;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		//Declaring an array
		int[] number= {2,4,8,9,3,6,5};
		Arrays.sort(number);
        //Sort the array 
		Arrays.sort(number);
		//iterate the values by using for loop 
		for (int i = 0; i < number.length; i++) {
			//If the index value isn't matched print the missing number
			if(number[i]!=i+1) {
				System.out.println(i+1);
				//break the loop
				break;
			}
			
		}
	}

}
