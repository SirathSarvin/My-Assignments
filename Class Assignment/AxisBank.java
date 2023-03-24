package week5.day5;

public class AxisBank extends YourBank {
	public void deposit() {
		System.out.println("Deposit the Money");
	}
	public static void main(String[] args) {
		AxisBank details =new AxisBank();
		details.saving();
		details.fixed();
		details.deposit();
	}

}
