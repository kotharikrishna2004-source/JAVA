package Connection_Established;

import java.sql.*;


public class Select_specific_table_metadata {

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
		
		//display metadata of specific table
		DatabaseMetaData db=ko.getMetaData();
		ResultSet rst=db.getTables(null, null, "my_table", null);
		while(rst.next())
		{
			System.out.println("Table Name: "+rst.getString("TABLE_NAME"));
			System.out.println("Table Type: "+rst.getString("TABLE_TYPE"));
			System.out.println("Table Catalog: "+rst.getString("TABLE_CAT"));
			System.out.println("Table Schema: "+rst.getString("TABLE_SCHEM"));
		}
	}

}
