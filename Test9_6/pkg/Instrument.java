package Test9_6.pkg;

abstract class Instrument {
	
	abstract void play();

}

class Piano extends Instrument {
	void play() {
		System.out.println("Piano makes the sound of tan tan tan");
	}
	
}
class Flute extends Instrument{
	void play() {
		System.out.println("Flute makes sound of toot toot toot");
	}
}
class Guitar extends Instrument {
	
	void play() {
		System.out.println("Guitar makes sound of tin tin tin");
	}
}
