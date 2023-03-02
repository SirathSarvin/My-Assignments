package week2.day4;

public class calculator {
	public void addTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subTwoNumber(int e,int f) {
		int g=e-f;
		System.out.println(g);
	}
	public void mulTwoNumber(double i,double j) {
		double k=i*j;
		System.out.println(k);
	}
	public void divTwoNumber(float x,float y) {
		float z=x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		calculator mycalc=new calculator();
		mycalc.addTwoNumber(22,34);
		mycalc.subTwoNumber(25, 20);
		mycalc.mulTwoNumber(23.23, 55.55);
		mycalc.divTwoNumber(123.987f,2.05f);
		

 }
	
}

