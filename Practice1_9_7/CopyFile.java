package Practice1_9_7;
import java.util.*;
import java.io.*;
public class CopyFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String src, dst;
		
		System.out.println("Please enter the source of file");
		src = sc.nextLine();
		System.out.println("Please enter the destination of file");
		dst = sc.nextLine();
		
		File sourcefile = new File(src);
		File destinationfile = new File(dst);
		if(!sourcefile.exists()) {
			System.out.println("Source file does not exist");
			return;
			
		}
		if(destinationfile.exists()) {
			System.out.println("Destination file already exists. Do you want to overwrite it?(yes/No)");
			
			String choice = sc.nextLine();
			if(choice.equals("no")) {
				System.out.println("File operation cancled");
				return;
			}
		}
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dst);
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
	}
	}
}
