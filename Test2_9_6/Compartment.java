package Test2_9_6;

public abstract class Compartment {
	
	abstract void function();
	

}

class FirstClass extends Compartment{

	@Override
	void function() {
		System.out.println("This is a First Class Compartment");
		
	}
	
}

class Ladies extends Compartment{
	void function() {
		System.out.println("This is a Ladies Compartment");
		
	}
}

class Genral extends Compartment{
	void function() {
		System.out.println("This is a Genral Compartment");
		
	}
}

class Luggage extends Compartment{
	void function() {
		System.out.println("This is a Luggage Compartment");
		
	}
}