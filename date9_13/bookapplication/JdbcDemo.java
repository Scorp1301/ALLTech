package date9_13.bookapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo {
	private static String JdbcUrl = "jdbc:mysql://localhost:3306/Test";
	private static String jdbcUserName="Admin";
	private static String jdbcPassword="Scorpion@24";
	public static Connection getConnection() {
		Connection connection =null;
		try {
			connection = DriverManager.getConnection(JdbcUrl, jdbcUserName, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
