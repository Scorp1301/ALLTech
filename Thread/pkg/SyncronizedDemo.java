package Thread.pkg;

public class SyncronizedDemo {
	
	public static void main(String[] args) {
		DisplayMsg dm = new DisplayMsg();
		MyyThread m1 = new MyyThread(dm, "Steve");
		MyyThread m2 = new MyyThread(dm, "Mark");
		
		m1.start();
		m2.start();
		
	}

	}

