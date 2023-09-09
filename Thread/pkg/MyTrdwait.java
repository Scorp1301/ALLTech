package Thread.pkg;

public class MyTrdwait extends Thread {
	int total;
	
	@Override
	public void run() {
		System.out.println("Chile Class is calculaitng sum");
		synchronized (this) {
			for(int i = 1; i<100;i++) {
				total += i;
				
			}
			this.notify();
			
		}
	}
	

}
