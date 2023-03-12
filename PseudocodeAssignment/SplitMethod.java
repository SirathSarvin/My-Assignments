package Pseudocode.Assignment;

public class SplitMethod {
	public static void main(String[] args) {
		//Declare the string with values
		String text="Amazon has 20,000 employees @ &in chennai";
		//by replaceAll split the alphabets and get number from text 
		String replaceAll = text.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		//using Contains can check the word present in string
		boolean Contains = text.contains("amazon");
		System.out.println("contains");
	
}
}


