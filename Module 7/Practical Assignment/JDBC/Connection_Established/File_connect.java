package Connection_Established;

import java.sql.Connection;
import java.sql.DriverManager;

public class File_connect {
public static Connection getconnection() throws Exception, ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver Loaded Successfully");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tops_stu","root","");
	System.out.println("Connection Established Successfully");
	return conn;
	
}
}