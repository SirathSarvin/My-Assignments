package Pseudocode.Assignment;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//Declaring the string values 
		String str1="race";
		String str2="care";
		
		int length1=str1.length();
		int length2=str2.length();
		//Comparing that both the string are equal
		if (length1==length2) {
			System.out.println("length are equal");
			}else {
				System.out.println("not equal");
			}
		//Convert the str1 to character
		char[] i= str1.toCharArray();
		//Convert the str2 to character
		char[] j= str2.toCharArray();
		
		//Sort the character array
		Arrays.sort(i);
		Arrays.sort(j);
		
		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.toString(j));
		
		boolean equals =Arrays.equals(i, j);
		System.out.println(equals);
		
		//Compare both the array
		//If sorted character arrays are same
	    //Then the string is anagram
		if(Arrays.equals(i, j)){
		     System.out.println("the gn string is anagram");
		}else {
			    System.out.println("not anagram");
		}
	}
	

}
