package Pseudocode.Assignment;

public class Swapping {
	public static void main(String[] args) {
		//declare  the variable
		int a = 7;
		int b = 14;
		
		//add the two values to assign 'a'
		a = a + b;
		//sub 'a' and 'b' to store it in 'b'
		b = a - b;
		//sub 'a' and 'b' to store it in 'a'
		
		a = a - b;
		
		System.out.println("swapped values of a is "+a);
		System.out.println("swapped values of b is "+b);

}
}
