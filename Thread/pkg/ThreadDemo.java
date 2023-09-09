package Thread.pkg;

public class ThreadDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		
		m1.setName("m1");
		m2.setName("m2");
		
		m1.start();
		m2.start();

	}

}
