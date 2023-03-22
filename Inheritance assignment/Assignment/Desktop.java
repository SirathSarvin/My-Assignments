package org.system;

public class Desktop extends computer {
	public void destopSize() {
		System.out.println("Destop size is 30 inches");
	}
	public static void main(String[] args) {
		Desktop system = new Desktop();
		system.computerModel();
		system.destopSize();
	}

}
