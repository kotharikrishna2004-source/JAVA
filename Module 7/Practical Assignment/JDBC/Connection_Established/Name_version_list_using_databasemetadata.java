package Connection_Established;
import java.sql.*;
public class Name_version_list_using_databasemetadata {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub
		Connection ho=File_connect.getconnection();
		DatabaseMetaData dbmd=ho.getMetaData();
		
		//get database name
		System.out.println("Database Name: "+dbmd.getDatabaseProductName());
		
		//get database version
		System.out.println("Database Version: "+dbmd.getDatabaseProductVersion());
		
		//list of all the tables
		ResultSet rs=dbmd.getTables(null, null, "%", new String[] {"TABLE"});
		
		//support sql features
		System.out.println("Supports Stored Procedures: "+dbmd.supportsStoredProcedures());
	}

}
