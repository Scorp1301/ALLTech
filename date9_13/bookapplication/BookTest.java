package date9_13.bookapplication;

import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		
		
		BookDAO b = new BookDAO();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		while(!exit) {
		System.out.println("Menu");
		System.out.println("1. Add");
		System.out.println("2. Update Price");
		System.out.println("3. Delete book by ID");
		System.out.println("4. Find Book by id");
		System.out.println("5. Display all Books");
		System.out.println("6. Exit");
		System.out.println("Please enter your choice");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1: 
			b.insertRecord();
			break;
		case 2:
			b.updateRecord();
			break;
		case 3:
			b.delete();
			break;
		case 4:
			b.display();
			break;
		case 5:
			b.displayAll();
			
			break;
		case 6:
			exit = true;
			System.out.println("Thank you!");
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		}
	}

}

