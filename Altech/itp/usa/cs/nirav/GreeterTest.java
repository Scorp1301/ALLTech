package Altech.itp.usa.cs.nirav;

public class GreeterTest {

	public static void main(String[] args) {
		Greeter g = new Greeter("nirav","abc");
		g.sayHello();
		
		Advisor a = new Advisor("have a good day", "keep trying", "Stay Hydrated", "Stay focused", "stay healthy");
		
		a.getAdvice();
		
		g.sayGoodBye();
	
		
	
	}
}
