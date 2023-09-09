package Thread.pkg;

public class MultiThreadDemo extends Thread {
	public static void main(String[] args) {
		MultiThreadDemo mt1 = new MultiThreadDemo();
		mt1.setPriority(MAX_PRIORITY);
		mt1.setName("mt1");
		mt1.start();
		
		MultiThreadDemo mt2 = new MultiThreadDemo();
		mt2.setPriority(MAX_PRIORITY);
		mt2.setName("mt1");
		mt2.start();
		
		for(int j = 0; j<15;j++) {
			System.out.println("j"+j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
	
	public void run(){
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
