package Test9_6.pkg;

public class Main {
	public static void main(String[] args) {
		Instrument[] instrument = new Instrument[10];
		
		for(int i =0; i<10; i++) {
			if(i%3 ==0) {
				instrument[i] = new Piano();
			}
			if(i%3 ==1) {
				instrument[i] = new Flute();
			}
			if(i%3 ==2) {
				instrument[i] = new Guitar();
			}
		}
		
		for(int i = 0; i<10; i++) {
			
			instrument[i].play();
			if(instrument[i] instanceof Piano) {
				System.out.println("Piano is at" +i);
			}
			if(instrument[i] instanceof Flute) {
				System.out.println("Flute is at" +i);
			}
			if(instrument[i] instanceof Guitar) {
				System.out.println("Guitar is at" +i);
			}
		}
	
	
	}

}
