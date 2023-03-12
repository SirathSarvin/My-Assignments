package Pseudocode.Assignment;

public class Palindrome {
	public static void main(String[] args) {
		//Declaring the string
		 String str = "TENET";
		 //Declaring the rev has empty string to see the reverse character
	     String rev = "";
	     //Iterate the for loop 
	        for (int i = str.length() - 1; i >=0; i--) {
	            rev = rev + str.charAt(i);
	        }
	        //Comparing that both str and rev are equal 
	        if (str.equals(rev))
	            System.out.println(str + " is palindrome");
	        else
	            System.out.println(str + " is not palindrome");
	}

}
