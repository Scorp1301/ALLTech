package Thread.pkg;

public class DisplayMsg {
	public synchronized void sayHello(String name) {
		for(int i = 0 ; i<10; i++) {
			System.out.println("How are you"+name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
