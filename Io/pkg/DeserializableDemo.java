package Io.pkg;

import java.io.*;

public class DeserializableDemo {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("C://Users//nirav//OneDrive//Desktop//ab.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee emp = (Employee) obj;
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.salary);
		System.out.println(emp.ssn);
	}

}
