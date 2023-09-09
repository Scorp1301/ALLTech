package test3_9_6;

public class Medicine {
	void displayLable() {
		System.out.println("ABC, XYZ");
	}

}

class Tablet extends Medicine{
	void displayLable() {
		super.displayLable();
		System.out.println("Store in a cool dry place");
	}
}

class Syrup extends Medicine{
	void displayLable() {
		super.displayLable();
		System.out.println("Shake well before use");
	}
}

class Ointment extends Medicine{
	void displayLable() {
		super.displayLable();
		System.out.println("External use only");
	}
}
