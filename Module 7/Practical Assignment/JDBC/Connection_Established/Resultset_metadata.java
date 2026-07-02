package Connection_Established;
import java.sql.*;
public class Resultset_metadata {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub
		Connection ko=File_connect.getconnection();
		Statement st=ko.createStatement();
		ResultSet rs=st.executeQuery("select * from my_table");
		ResultSetMetaData rsmd=rs.getMetaData();
		
		int columncount=rsmd.getColumnCount();
		System.out.println("Total columns: "+columncount);
		for(int i=1;i<=columncount;i++)
		{
			System.out.println("Column "+i+" : "+rsmd.getColumnName(i)+" - Type: "+rsmd.getColumnTypeName(i));
			System.out.println("Precision: "+rsmd.getPrecision(i));
			System.out.println("Scale: "+rsmd.getScale(i));
			System.out.println("Is Nullable: "+rsmd.isNullable(i));
			System.out.println("Is Auto Increment: "+rsmd.isAutoIncrement(i));
		}
		
	}

}
