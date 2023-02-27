package weekly.Assignment2;

public class car {
	public void opencloseDoor() {
		System.out.println("Open the Door and Close the Door");
		}
	public void siderearviewMirrors() {
		System.out.println("Check the both Side Mirrors and RearView Mirror");
		}
	public void start() {
		System.out.println("Start the vehicle");
		}
	public void AC() {
		System.out.println("Turn ON AC");
		}
	public void indicator() {
		System.out.println("Turn ON/OFF Indicator");
		}
	public void applyBreak() {
		System.out.println("Break");
		}
	public void off() {
		System.out.println("OFF the Vehicle");
		}
	
	public static void main(String[] args) {
		car Sircar= new car();
		Sircar.opencloseDoor();
		Sircar.siderearviewMirrors();
		Sircar.start();
		Sircar.AC();
		Sircar.indicator();
		Sircar.applyBreak();
		Sircar.off();
	}
	
}
