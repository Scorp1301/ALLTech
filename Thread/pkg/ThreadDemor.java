package Thread.pkg;

public class ThreadDemor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadr m1 = new MyThreadr();
		MyThreadr m2 = new MyThreadr();
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		
		t1.start();
		t2.start();

	}

}
