package GC.pkg;

public class Car {
	
	int speed;
	int noOfGears;
	
	public Car(int speed, int noOfGears) {
		this.speed = speed;
		this.noOfGears = noOfGears;
	}

	void drive() {
		System.out.println("Car Starts at speed of "+speed+"and has "+noOfGears+"Gears.");
		
	}
	
	void display() {
		System.out.println("Speed:" +speed);
		System.out.println("Gears:"+noOfGears);
	}

}

class SportCar extends Car{
	boolean airBallonType;

	public SportCar(int speed, int noOfGears, boolean airBallonType) {
		super(speed, noOfGears);
		this.airBallonType = airBallonType;
	}
	
	void display() {
		super.display();
		System.out.println("The Air Balloon Type:" +airBallonType);
	}
	
}
