package Connection_Established;

import java.sql.*;

public class PreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub
		
			Connection c=File_connect.getconnection();
			String query = "INSERT INTO my_table(id, name,city) VALUES (?, ?,?)";
			java.sql.PreparedStatement ps = c.prepareStatement(query);

			ps.setInt(1, 3);
			ps.setString(2, "Bhawani");
			ps.setString(3, "Banglore");
			
			ps.executeUpdate();
			System.out.println("Data inserted successfully");
			
		
		
		
		
		
	}

}
