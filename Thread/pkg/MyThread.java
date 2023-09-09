package Thread.pkg;

class MyThread extends Thread {
	public void run() {
		System.out.println("Thread Name"+ Thread.currentThread().getName());
		for(int i = 0; i<15;i++) {
			System.out.println("i=" +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}


}

	