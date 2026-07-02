package Connection_Established;

import java.sql.Connection;
import java.sql.Statement;

public class Insert_using_statement {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub
		Connection mycon=File_connect.getconnection();
		System.out.println(" Conncection successful using File_connect class");
		Statement st=mycon.createStatement();
		String sql="insert into my_table(name,city) values('Ravi','Delhi')";
		
		int success=st.executeUpdate(sql);
		if(success==1) {
			System.out.println("Data inserted successfully using Statement");
			}else {
				System.out.println("Data not inserted");
			}
		
		
		
		
	}

}
