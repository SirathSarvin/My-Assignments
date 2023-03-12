package Pseudocode.Assignment;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		//Declare the string
		String name="sarvin";
		//Convert the string into character Array
		char[]n=name.toCharArray();
		//Iterate for loop
		for(int i=0;i<name.length();i++)
		{
			//Condition to find the odd 
			if(i%2!=0)
			{	 
				//Convert the Character class to upper class
				n[i]=Character.toUpperCase(n[i]);	
			}		
			
		}
		 
		System.out.println(n);	
	}



}


