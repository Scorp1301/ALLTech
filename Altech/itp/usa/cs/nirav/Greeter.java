package Altech.itp.usa.cs.nirav;

import java.util.Random;

public class Greeter {
	String[] name;

	public Greeter(String n1, String n2) {
		this.name[0] = n1;
		this.name[1] = n2;
	}
	
	
	void sayHello() {
		
		System.out.println("Hello , "+ name);
		
		//getAdvice();
		//sayGoodBye();
		
	}
	
	void sayGoodBye() {
		for(int i = name.length; i>=0; i--) {
			System.out.println("GoodBye:"+ name[i]);
		}
	}

}

class Advisor {
	String[] message = new String[5];

	public Advisor(String s1, String s2,String s3,String s4,String s5) {
		this.message[0] = s1;
		this.message[1] = s2;
		this.message[2] = s3;
		this.message[3] = s4;
		this.message[4] = s5;
	}
	
	
	public void getAdvice() {
		
//		message[0] = "have a good day";
//		message[1] = "keep trying";
//		message[2] = "Stay Hydrated";
//		message[3] = "Stay focused";
//		message[4] = "stay healthy";
		
		Random random = new Random();
		
		int randomint = random.nextInt(5) +1;
		
		System.out.println("Advice:" +message[randomint]);
		
	}
	
}