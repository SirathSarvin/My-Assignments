package Pseudocode.Assignment;

public class Duplicate {
	public static void main(String[] args) {
		//Declare an array 
		int[] num= {5,7,6,1,2,3,7,5,1};
		
		//Iterate the value using for loop
		for (int i = 0;i<num.length;i++) {
			//Iterate nested for loop
			for (int j = i+1; j<num.length;j++) {
				//Compare that both num are equal
				if(num[i]==num[j]) {
					
				}
			}
			
				System.out.println(num[i]);
			}
		}
	}



