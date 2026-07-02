package Connection_Established;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class process_jdbc_driver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","");
		System.out.println("Connection Established");
	}

}
