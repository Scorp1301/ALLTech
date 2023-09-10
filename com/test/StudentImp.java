package com.test;
import java.io.*;

import com.student.*;

public class StudentImp  {
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.readStudInfo();
		student.calcTotal();
		student.printStudInfo();
		
		try {
			FileOutputStream fos;
			ObjectOutputStream oos;
			fos = new FileOutputStream("C://Users//nirav//OneDrive//Desktop//StudentInfo.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(student);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Object saved onto  the file");
	}

}
