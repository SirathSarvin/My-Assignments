package Pseudocode.Assignment;

public class FindIntersection {
	public static void main(String[] args) {
		//Declare int arrays
		int s[]= {3,2,11,4,6,7};
		int p[]= {1,2,8,4,9,7};
		//iterate for loop
		for(int i=0;i<s.length;i++)
		{
			//iterate nested for loop
			for(int j=0;j<p.length;j++)
			{ 
				//Compare that both are equal
				if(s[i]==p[j])
					System.out.print(s[i]+" ");
			}
		}
	}


}
