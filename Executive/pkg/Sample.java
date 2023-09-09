package Executive.pkg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample {
	public static void main(String[] args) {
		ExecutorService e = Executors.newFixedThreadPool(5);
		System.out.println("Thread submitting tast"+Thread.currentThread().getName());
		
		for(int i = 0; i<3; i++) {
			e.execute(new Task());
		}
	}

}
