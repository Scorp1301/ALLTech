package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Executive.pkg.main;

public class Student {
		private ArrayList<String> names = new ArrayList<String>();
		public void setNames() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the number of students you want to add:");
			int n = sc.nextInt();
			
			sc.nextLine();
			
			for(int i =0; i<n; i++) {
				System.out.println("please enter the name of student:");
				String name = sc.nextLine();
				names.add(name);
			}
			
		}
		
		public void searchNames(String name) {
			if(names.contains(name)) {
				System.out.println(name+"is in the List.");
			}
			else {
				System.out.println(name+"was not found in the List.");
			}
		}
		
		public void searchNames(int index) {
			if(index > 0 && index< names.size()) {
				System.out.println("The student at index " +index+ ":" +names.get(index));
			}
			else {
				System.out.println("Invalid index");
			}			
		}
		public void printNames() {
			Iterator<String> itr = names.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		
		public void removeName(String stuName) {
			if(names.contains(stuName)) {
				names.remove(stuName);
				System.out.println("The student has been removed");
			}
			else {
				System.out.println("Student is not in the list");
			}
		}

}
