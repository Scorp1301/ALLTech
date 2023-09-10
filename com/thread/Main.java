package com.thread;

import Executive.pkg.main;

public class Main extends Thread {
	public static void main(String[] args) {
		Main m1 = new Main();
		m1.setPriority(MAX_PRIORITY);
		m1.start();
		
		Main m2 = new Main();
		m2.start();
		
	}
	

}
