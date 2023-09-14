package date9_13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test7 {
	private static String UPDATE_USER_QUERY = "update user set salary = ? where id = ?";
	public static void main(String[] args) {
		Test7 update = new Test7();
		update.updateRecord();
	}
	public void updateRecord() {
		System.out.println(UPDATE_USER_QUERY);
		try(Connection con = JdbcDemo.getConnection()){
			PreparedStatement preparedstatement = con.prepareStatement(UPDATE_USER_QUERY);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the id of employee you want to update:");
			int id = sc.nextInt();
			preparedstatement.setInt(1, id);
			System.out.println("Enter the amount to set for salary:");
			double a = sc.nextDouble();
			preparedstatement.setDouble(2, a);
			
			preparedstatement.executeUpdate();
			System.out.println("Info is updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
