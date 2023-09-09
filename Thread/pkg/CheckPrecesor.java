package Thread.pkg;

public class CheckPrecesor implements Runnable {
	public void run() {
		for(int i =0; i<15; i++) {
			System.out.println("I:" +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		CheckPrecesor cp = new CheckPrecesor();
		Thread t = new Thread(cp);
		t.start();
		
		for(int j = 0; j<20; j++) {
			System.out.println("j:"+j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}

}
