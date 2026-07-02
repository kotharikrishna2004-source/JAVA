package Connection_Established;

import java.sql.Connection;
import java.sql.Statement;

public class Update_using_statement {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub
		Connection my =File_connect.getconnection();
		System.out.println(" Connection successully using file");
		Statement st=my.createStatement();
		System.out.println(" For Fire Quries");
		
		String str="update my_table set Name='Ravi',id=1 where id=10";
		int success=st.executeUpdate(str);
		if(success>0) {
			System.out.println(" Record updated successfully");
			}else {
				System.out.println(" Record not updated");
			}
	}

}
