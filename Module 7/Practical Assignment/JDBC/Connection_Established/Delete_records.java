package Connection_Established;

import java.sql.Connection;
import java.sql.Statement;

public class Delete_records {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub
		Connection ctr=File_connect.getconnection();
		System.out.println(" Connection successful using File_connect class");
		Statement sm=ctr.createStatement();
		String query="delete from my_table where id=9";
		
		int success=sm.executeUpdate(query);
		if(success>0) {
			System.out.println("Record deleted successfully");
		}
		else {
			System.out.println("Record not deleted");
		}
		
		
	}

}
