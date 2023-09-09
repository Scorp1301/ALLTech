package EH.pkg;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalcAverage cal = new CalcAverage();
		Number n = null;
		
		while(true) {
			System.out.println("Menu:");
			System.out.println("1. Calculate Avg of N natural number");
			System.out.println("2. Perform Arithmatic Operations");
			System.out.println("Enter your choice: ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter N:");
				int N = sc.nextInt();
				
				try {
					double avg = cal.avgFirstN(N);
					System.out.println("The average is" + avg);
				}catch(IllegalArgumentException e) {
					System.out.println("Please enter natural number");
				}
				break;
			case 2:
				System.out.println("Enter the first number:");
				int firstN = sc.nextInt();
				System.out.println("Enter the second number:");
				int secondN = sc.nextInt();
				
				n = new Number(firstN, secondN);
				System.out.println("1. Add");
				System.out.println("2. Sub");
				System.out.println("3. Mul");
				System.out.println("4. Div");
				System.out.println("Please enter your choice");
				
				int opchoice = sc.nextInt();
				
				switch(opchoice) {
				case 1:
					n.add(firstN, secondN);
					break;
				case 2:
					n.sub(firstN, secondN);
					break;
					
				case 3:
					n.mul(firstN, secondN);
					break;
				case 4:
					try {
						n.div(firstN, secondN);
					}catch(ArithmeticException e) {
						System.out.println("Second number can not be 0");
					}
					break;
				}	
			
		}
		
	}

}
}
