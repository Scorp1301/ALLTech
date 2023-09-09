package Thread.pkg;

public class SingleThreadDemo {
	public static void main(String[] args) {
		
	
	SingleThreadDemo st = new SingleThreadDemo();
	
		st.printNumber();
		for(int i=0;i<101; i++) {
			System.out.println("I:"+i);
		}
	}



void printNumber() {
	for(int j=0;j<201; j++) {
		System.out.println("J:"+j);
	}
	
}

}