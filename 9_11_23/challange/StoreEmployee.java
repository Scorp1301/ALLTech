package challange;

import java.io.*;
import java.util.Scanner;



public class StoreEmployee {
	public static void main(String[] args) throws IOException{
		Employee e1 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Id of employee:" );
		e1.empId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Name of Employee:");
		e1.empName = sc.nextLine();
		System.out.println("Enter the Department no of Employee:");
		e1.deptNo = sc.nextInt();
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream("C://Users//nirav//OneDrive//Desktop//emp.ser");
			oos = new ObjectOutputStream(fos);
			//Employee emp = new Employee(1, "nirav", 100000, 12450);
			oos.writeObject(e1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Object saved onto  the file");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C://Users//nirav//OneDrive//Desktop//emp.ser");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			Object obj = ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Employee emp = (Employee) e1;
		System.out.println(e1.empId);
		System.out.println(e1.empName);		
		System.out.println(e1.deptNo);
	
	}

}
