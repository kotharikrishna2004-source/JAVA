package Connection_Established;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Student_model.Stu_information;
public class Previous_and_next_method {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub
		Connection no=File_connect.getconnection();
		Statement s = no.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
        );
		String query="select * from my_table";
		ResultSet rs=s.executeQuery(query);
		List<Stu_information> list=new ArrayList<Stu_information>();
		//next() method is used to move the cursor forward one row from its current position.
		System.out.println("Using next() method:");
		while(rs.next()) {
			Stu_information stu=new Stu_information();
			stu.setId(rs.getInt("id"));
			stu.setName(rs.getString("Name"));
			stu.setCity(rs.getString("city"));
			list.add(stu);
		}
		for(Stu_information s1:list) {
			System.out.println(" "+s1.getId()+" "+s1.getName()+" "+s1.getCity());
			
		}
		list.clear();
		
		 rs.afterLast();
		//previous() method is used to move the cursor backward one row from its current position.
		System.out.println("Using previous() method:");
		while(rs.previous()) {
			Stu_information stu=new Stu_information();
			stu.setId(rs.getInt("id"));
			stu.setName(rs.getString("Name"));
			stu.setCity(rs.getString("city"));
			list.add(stu);
		}
		for(Stu_information s1:list) {
			System.out.println(" "+s1.getId()+" "+s1.getName()+" "+s1.getCity());
			
		}
		
	}

}
