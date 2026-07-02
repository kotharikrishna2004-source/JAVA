package Connection_Established;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Student_model.Stu_information;

public class Select_with_resultset {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub
		Connection make=File_connect.getconnection();
		Statement st=make.createStatement();
		String query="select * from my_table";
		List<Stu_information> list=new ArrayList<Stu_information>();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			Stu_information stu=new Stu_information();
			stu.setId(rs.getInt("id"));
			stu.setName(rs.getString("Name"));
			stu.setCity(rs.getString("city"));
			list.add(stu);
		}
		for(Stu_information s:list) {
			System.out.println(" "+s.getId()+" "+s.getName()+" "+s.getCity());
			
			
		}
		
	}

}
