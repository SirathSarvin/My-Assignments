package weekly.assignment;

public class TwoWheeler {
	
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=9876543215678l;
	boolean isPunctured=true;
	String bikeName="Jawa 42";
	double runningKM=23257.88;
	
	public static void main(String[]args) {
		
        TwoWheeler myBike= new TwoWheeler();
		
		System.out.println("No of Wheels = "+myBike.noOfWheels);
		System.out.println("No of Mirrors = "+myBike.noOfMirrors);
		System.out.println("Chass is Number = "+myBike.chassisNumber);
		System.out.println("Is Bike Punctured = "+myBike.isPunctured);
		System.out.println("Bike Name = "+myBike.bikeName);
		System.out.println("Running KM = "+myBike.runningKM);
		
	}

}
