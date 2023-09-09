package Executive.pkg;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main {

	public static void main(String[] args) {
		double length = 3.0;
		double width = 5.3;
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		RectangleCal cal = new RectangleCal(length, width);
		
		Future<Double> future = executor.submit(cal);
		
		double area;
		try {
			area = future.get();
			System.out.println(area);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executor.shutdown();

	}

}
