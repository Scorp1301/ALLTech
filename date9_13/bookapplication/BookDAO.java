package date9_13.bookapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//import date9_13.JdbcDemo;


public class BookDAO {
	
	public static void display() {
		String FIND_BOOK_QUERY = "select * from book where bookId =(?);";
		System.out.println(FIND_BOOK_QUERY);
		try(Connection con = JdbcDemo.getConnection()){
			PreparedStatement preparedstatement = con.prepareStatement(FIND_BOOK_QUERY);
			Scanner sc = new Scanner(System.in);
			int bookId = sc.nextInt();
			preparedstatement.setInt(1, bookId);
			ResultSet resultset = preparedstatement.executeQuery();
			if(resultset.next()) {
				int id = resultset.getInt("bookId");
				String name = resultset.getString("name");
				double price = resultset.getDouble("price");
				String author = resultset.getString("author");
				
				System.out.println("Book ID :" + id);
				System.out.println("Book Name:"+name);
				System.out.println("Book Price:"+price);
				System.out.println("Book Author:" +author);
				
			}else {
				System.out.println("Book does not exist");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public static void displayAll() {
		String FIND_BOOK_QUERY = "select * from book;";
		System.out.println(FIND_BOOK_QUERY);
		try(Connection con = JdbcDemo.getConnection()){
			PreparedStatement preparedstatement = con.prepareStatement(FIND_BOOK_QUERY);
			//preparedstatement.setInt(1, bookId);
			ResultSet resultset = preparedstatement.executeQuery();
			
			while(resultset.next()) {
				int id = resultset.getInt("bookId");
				String name = resultset.getString("name");
				double price = resultset.getDouble("price");
				String author = resultset.getString("author");
				
				System.out.println("Book ID :" + id);
				System.out.println("Book Name:"+name);
				System.out.println("Book Price:"+price);
				System.out.println("Book Author:" +author);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public static void updateRecord() {
		String UPDATE_USER_QUERY = "update book set price = ? where bookId = ?";
		System.out.println(UPDATE_USER_QUERY);
		try(Connection con = JdbcDemo.getConnection()){
			PreparedStatement preparedstatement = con.prepareStatement(UPDATE_USER_QUERY);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the id of Book you want to update:");
			int bookId = sc.nextInt();
			preparedstatement.setInt(2, bookId);
			System.out.println("Enter the amount to set for price:");
			double a = sc.nextDouble();
			preparedstatement.setDouble(1, a);
			
			preparedstatement.executeUpdate();
			System.out.println("Info is updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public static void insertRecord() {
		String INSERT_BOOK_QUERY="insert into book"+"(bookId,name,price,author) values"+"(?,?,?,?);";
		System.out.println(INSERT_BOOK_QUERY);
		try(Connection con = JdbcDemo.getConnection()){
			PreparedStatement preparedstatement = con.prepareStatement(INSERT_BOOK_QUERY);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Book ID:");
			int id = sc.nextInt();
			preparedstatement.setInt(1, id);
			sc.nextLine();
			System.out.println("Enter the name of Book");
			String name = sc.nextLine();
			preparedstatement.setString(2, name);
			//sc.nextLine();
			System.out.println("Enter the Price of Book");
			double price = sc.nextDouble();
			sc.nextLine();
			preparedstatement.setDouble(3, price);
			System.out.println("Enter the author of Book");
			String author = sc.nextLine();
			preparedstatement.setString(4, author);
			
			preparedstatement.executeUpdate();
			System.out.println("Record is saved successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public static void delete() {
		String DELETE_BOOK_QUERY = "Delete from book where bookId =(?);";
		System.out.println(DELETE_BOOK_QUERY);
		try(Connection con = JdbcDemo.getConnection()){
			PreparedStatement preparedstatement = con.prepareStatement(DELETE_BOOK_QUERY);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the id you want to delete");
			int bookId = sc.nextInt();
			preparedstatement.setInt(1, bookId);
			
			preparedstatement.executeUpdate();
			System.out.println("Your book has been deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
