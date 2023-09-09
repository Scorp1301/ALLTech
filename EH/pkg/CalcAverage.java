package EH.pkg;

public class CalcAverage {
	
	public double avgFirstN(int N) {
		if(N<=0) {
			throw new IllegalArgumentException("N must be a positive number");
		}
		
		int sum = 0;
		
		for (int i = 1; i<=N; i++) {
			sum += i;	
		}
		return(double) sum/N;	
	}
}
