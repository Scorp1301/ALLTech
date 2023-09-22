package test;

import com.gl.book.dao.BookDAO;
import com.gl.book.dao.impl.BookDAOImpl;

public class BookTest {
	public static void main(String[] args) {
		
	BookDAO b = new BookDAOImpl();
	b.create();
	//b.read();
	
	}
}
