package Thread.pkg;

import java.util.Scanner;

public class JoinDemo extends Thread {
	static int n, sum = 0;
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		System.out.println("sum of first N number");
		System.out.println("Please enter the value of N");
		Scanner sc = new Scanner(System.in);
		JoinDemo.n = sc.nextInt();
		
		JoinDemo jd = new JoinDemo();
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The sum of first"+n+ "digits is"+ JoinDemo.sum);
		
		long end = System.currentTimeMillis();
		System.out.println("The total time to calculate the program was"+(end-start)/1000);
	}
	
	public void run() {
		for(int i=0; i<= JoinDemo.n; i++) {
			JoinDemo.sum +=i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
