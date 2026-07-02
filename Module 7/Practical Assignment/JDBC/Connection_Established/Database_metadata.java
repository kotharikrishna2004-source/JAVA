package Connection_Established;
import java.sql.*;
public class Database_metadata {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub
		Connection key=File_connect.getconnection();
		DatabaseMetaData dbmd=key.getMetaData();
		System.out.println("Driver Name: "+dbmd.getDriverName());
		System.out.println("Driver Version: "+dbmd.getDriverVersion());
		System.out.println("UserName: "+dbmd.getUserName());
		System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
		System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());	
		key.close();
	}

}
