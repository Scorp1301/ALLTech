package test3_9_6;

import java.util.Random;

public class TestMedicine {
	public static void main(String[] args) {
		
	Medicine[] med = new Medicine[10];
	Random random = new Random();
	
	for(int i=0; i<10; i++ ) {
		int randomint = random.nextInt(3) +1;
		if(randomint ==1) {
			med[i] = new Tablet();
		}
		if(randomint ==2) {
			med[i] = new Syrup();
		}
		if(randomint ==3) {
			med[i] = new Ointment();
		}
		
	}
	
	for(int i = 0; i<10; i++) {
		med[i].displayLable();
	}
	
}
}
	
