package Thread.pkg;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		MyTrdwait t = new MyTrdwait();
		t.start();
		
		synchronized (t) {
			System.out.println("Main thread is going to wait");
			
			t.wait();
			System.out.println("Main thread notify");
			System.out.println(t.total);
			
		}
	}
}
