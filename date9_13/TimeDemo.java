package date9_13;

import java.time.LocalTime;

public class TimeDemo {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
		System.out.println(n);
	}

}
