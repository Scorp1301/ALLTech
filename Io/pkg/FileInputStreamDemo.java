package Io.pkg;
import java.io.*;
public class FileInputStreamDemo {
	public static void main(String[] args) throws Exception {
		/*FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C://Users//nirav//OneDrive//Desktop//Apple jobs.txt");
			fos = new FileOutputStream("C://Users//nirav//OneDrive//Desktop//eg.txt");
			System.out.println("File is Open");
			int data;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("Coppied Successfully");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}finally {
			try {
				fis.close();
				
			}catch(IOException io){
				io.printStackTrace();
			}
			
			}*/
		FileReader fr = null;
		FileWriter fw = null;
		fr = new FileReader("C://Users//nirav//OneDrive//Desktop//Apple jobs.txt");
		fw = new FileWriter("C://Users//nirav//OneDrive//Desktop//fw.txt");
		
		int ch;
		
		while((ch = fr.read()) != -1) {
			fw.write(ch);	
	
		}
		System.out.println("File Copied");
		fr.close();
		fw.close();
	}
}