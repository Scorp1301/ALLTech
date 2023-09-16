package com.gl.core;

import java.util.Scanner;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.employee.dao.EmployeeDAO;
import com.gl.employee.model.Employee;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO dao = (EmployeeDAO) ctx.getBean("employeeDAO");
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		
		while(!exit){
			System.out.println("Menu");
			System.out.println("1. Add");
			System.out.println("2. Update ");
			System.out.println("3. Delete by ID");
			System.out.println("4. Display all ");
			System.out.println("5. Exit");
			System.out.println("Please enter your choice");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Employee id, Name, Age, Salary");
				Employee e = new Employee(sc.nextInt(),sc.next(), sc.nextInt(), sc.nextDouble());
				dao.insert(e);
				System.out.println("Record Added");
				break;
		
			case 2:
				System.out.println("Enter the id and name you want to update");
				String name = sc.next();
				int id = sc.nextInt();
				dao.update(name, id);
				System.out.println("Updated record");
				break;
				
			case 3:
				System.out.println("Enter the id you want to delete");
				int i = sc.nextInt();
				dao.delete(i);
				System.out.println("Deleted Record");
				break;
			case 4:
				System.out.println("The employees in database are:");
				dao.read();
				break;
			case 5:
				exit = true;
				System.out.println("Thank you!");
				break;
				
		}
		
		
		
	}

}}