package com.student;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements StudentInt, Serializable {
	private int rollNo;
	private String name;
	private int subject1;
	private int subject2;
	private int subject3;
	private int totalMarks;
	
	public Student() {
	
	}
	
	public Student(int rollNo, String name, int subject1, int subject2, int subject3, int totalMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.totalMarks = totalMarks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSubject1() {
		return subject1;
	}
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}
	public int getSubject2() {
		return subject2;
	}
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}
	public int getSubject3() {
		return subject3;
	}
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}

	
	public void readStudInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Student RollNo:");
		this.rollNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Please Enter Student Name:");
		this.name = sc.nextLine();
		//System.out.println("\n");
		System.out.println("Please Enter Student marks in Subject1");
		this.subject1 = sc.nextInt();
		System.out.println("Please Enter Student marks in Subject2");
		this.subject2 = sc.nextInt();
		System.out.println("Please Enter Student marks in Subject3");
		this.subject3 = sc.nextInt();
		
		
	}

	public void calcTotal() {
		 totalMarks = subject1+subject2+subject3;
		
	}

	public void printStudInfo() {
		System.out.println("Roll Number" +rollNo);
		System.out.println("Name" +name);
		System.out.println("SUbject 1 Marks" +subject1);
		System.out.println("SUbject 2 Marks" +subject2);
		System.out.println("SUbject 3 Marks" +subject3);
		System.out.println("Total Marks" +totalMarks);
		
	}


}
