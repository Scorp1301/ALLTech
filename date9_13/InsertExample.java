package date9_13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import date9_12.JdbcDemo;

public class InsertExample {
	private static String INSERT_USERS_QUERY="insert into user"+"(id,name,email,country,password) values"+"(?,?,?,?,?);";

	public static void main(String[] args) {
		InsertExample insert = new InsertExample();
		insert.insertRecord();
		

	}

	public void insertRecord() {
		System.out.println(INSERT_USERS_QUERY);
		try(Connection con = JdbcDemo.getConnection()){
			PreparedStatement preparedstatement = con.prepareStatement(INSERT_USERS_QUERY);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the user ID:");
			int id = sc.nextInt();
			preparedstatement.setInt(1, id);
			sc.nextLine();
			System.out.println("Enter the name of user");
			String name = sc.nextLine();
			preparedstatement.setString(2, name);
			System.out.println("Enter the email of user");
			String email = sc.nextLine();
			preparedstatement.setString(3, email);
			System.out.println("Enter the country of user");
			String country = sc.nextLine();
			preparedstatement.setString(4, country);
			System.out.println("Enter the password of user");
			String pass = sc.nextLine();
			preparedstatement.setString(5, pass);
			
			preparedstatement.executeUpdate();
			System.out.println("Record is saved successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
