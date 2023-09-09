package Practice2_9_7;

import java.io.Serializable;
import java.util.Scanner;



class Student implements Serializable {
		int rollNo;
		String Name;
		int age;
		String Address;
		public Student(int rollNo, String name, int age, String address) {
			super();
			this.rollNo = rollNo;
			Name = name;
			this.age = age;
			Address = address;
		}
		public int getRollNo() {
			return rollNo;
		}
		public String getName() {
			return Name;
		}
		public int getAge() {
			return age;
		}
		public String getAddress() {
			return Address;
		}	
		
}

public class StreamDemo {
	public static void main(String[] args) {
		Student[] student;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please select what you want to do:");
		System.out.println("1. read" );
		System.out.println("2. Write");
		
		String choice = sc.nextLine();
		
	}
	
}


