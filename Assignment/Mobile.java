package weekly.assignment;

public class Mobile {
	
	String mobileBrandName = "Redmi";
	char logo = 'M';
	short noOfMobilePiece = 2871;
	int modelNumber = 556237689;
	long moblieLmeiNumber = 765432134567805l;
	float mobilePrice = 3999.99f;
	boolean isDamaged = false;
	
	public static void main(String[] args) {
		
		Mobile myNewMobile=new Mobile();
		System.out.println(myNewMobile.mobileBrandName);
		System.out.println("logo = "+myNewMobile.logo);
		System.out.println("Mobile Piece Number = "+myNewMobile.noOfMobilePiece);
		System.out.println("Model Number = "+myNewMobile.modelNumber);
		System.out.println("Mobile LMEI Number = "+myNewMobile.moblieLmeiNumber);
		System.out.println("Mobile Price = "+myNewMobile.mobilePrice);
		System.out.println("Is the Mobile Damaged = "+myNewMobile.isDamaged);
		
	}
		

}
