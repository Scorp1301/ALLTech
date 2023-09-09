package Thread.pkg.syncwait;

public class Counter extends Thread {
	Storage storage;

	public Counter(Storage storage) {
		super();
		this.storage = storage;
	}
	@Override
	public void run() {
		
			for(int i = 0; i<10;i++) {
				synchronized (storage) {
					storage.setNum(i);
					System.out.println(i);
					storage.notify();
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
