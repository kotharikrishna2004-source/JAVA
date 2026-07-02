package Connection_Established;
import java.sql.*;
public class Practise_callable_statement {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub
		Connection connect=File_connect.getconnection();
		Statement s=connect.createStatement();
		CallableStatement cs=connect.prepareCall("{call hii_name(?,?)}");
		
		int id=6;
		cs.setInt(1, id);
		
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.execute();
		String name=cs.getString(2);
		System.out.println("id: "+id+" name: "+name);
	}

}
