package date9_13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test6 {
	private static String Display_USER_QUERY="select * from user where id =(?);";  
	public static void main(String[] args) {
		
		Test6 dis = new Test6();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the employee you want to get Data");
		int empNO = sc.nextInt();
		display(empNO);
		
		
	}
	private static void display(int empNO) {
		System.out.println(Display_USER_QUERY);
		try(Connection con = JdbcDemo.getConnection()){
			PreparedStatement preparedstatement = con.prepareStatement(Display_USER_QUERY);
			preparedstatement.setInt(1, empNO);
			ResultSet resultset = preparedstatement.executeQuery();
			if(resultset.next()) {
				int id = resultset.getInt("id");
				String name = resultset.getString("name");
				String email = resultset.getString("email");
				
				System.out.println("Employee NO :" + id);
				System.out.println("Employee Name:"+name);
				System.out.println("Employee Email:" +email);
				
			}else {
				System.out.println("Employee does not exist");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	


}