package sync.thrd.pkg;

public class Printer extends Thread {
	
	Storage storage;

	public Printer(Storage storage) {
		super();
		this.storage = storage;
	}
	@Override
	public void run() {
		
			for(int i=0; i<10;i++) {
				synchronized (storage) {
					int value = storage.getNum();
					System.out.println("The value is"+value);
					
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//this.notify();
			
		}
	}

}
