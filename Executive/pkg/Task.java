package Executive.pkg;

public class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("The task execution started");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("------Task Completed-----");
	}
	

}
