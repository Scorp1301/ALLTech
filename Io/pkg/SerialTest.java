package Io.pkg;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialTest {
	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream("C://Users//nirav//OneDrive//Desktop//ab.ser");
			oos = new ObjectOutputStream(fos);
			Employee emp = new Employee(1, "nirav", 100000, 12450);
			oos.writeObject(emp);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Object saved onto  the file");
	//	fos.close();
	//	oos.close();
		
	}

}
