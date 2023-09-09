package EH.pkg;

public class Number {
	int firstN, secondN;
	double result;
	public Number(int firstN, int secondN) {
		this.firstN = firstN;
		this.secondN = secondN;
	}
	
	void add(int firstN, int secondN) {
		result = firstN + secondN;
		System.out.println(result);
	}
	
	void sub(int firstN, int secondN) {
		result = firstN - secondN;
		System.out.println(result);
	}
	void mul(int firstN, int secondN) {
		result = firstN * secondN;
		System.out.println(result);
	}
	void div(int firstN, int secondN) {
		if(secondN == 0) {
			throw new ArithmeticException("Division is not allowed by 0");
		}
		result = firstN / secondN;
		
		System.out.println(result);
	}
	

}
