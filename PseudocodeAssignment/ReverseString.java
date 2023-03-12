package Pseudocode.Assignment;

public class ReverseString {
	public static void main(String[] args) {
		//Declare the string name
		String text ="Sarvin";
		//Change the String into CharArray
		char[] character= text.toCharArray();{
		//Print element in array using for loop
		for(int i=character.length-1;i>=0;i--) 
		{
			System.out.print(character[i]);
		}
	}

	}

}
