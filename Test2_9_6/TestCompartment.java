package Test2_9_6;
import java.util.*;

public class TestCompartment {
	public static void main(String[] args) {
		Compartment[] comp = new Compartment[10];
		Random random = new Random();	
		
		for(int i = 0; i <10; i++) {
			int randomint = random.nextInt(4) +1;
			System.out.println(randomint);
			if (randomint == 1) {
				comp[i] = new FirstClass();
			}
			if(randomint == 2){
				comp[i] = new Ladies();
			}
			if (randomint == 3) {
				comp[i] = new Genral();
			}
			if (randomint == 4) {
				comp[i] = new Luggage();
			}
		}
		
		for(int i = 0; i<comp.length; i++) {
			
			comp[i].function();
			
		}
		
		
	}

}
