package Connection_Established;
import java.sql.*;
public class Callable_statement {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub
		Connection kk=File_connect.getconnection();
		Statement st=kk.createStatement();
		//CallableStatement used to execute stored procedure in database
		CallableStatement cs=kk.prepareCall("{call hii_name(?,?)}");
		
		int id=3;
		cs.setInt(1, id);
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.execute();
		String name=cs.getString(2);
		System.out.println("id: "+id+" name: "+name);	
		kk.close();
		
	}

}
