package Connection_Established;
import java.util.List;
import java.util.ArrayList;
import Student_model.Stu_information;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class Select_records {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stubList<Stu_information>li=Arraylist<Stu_information>;
		List<Stu_information> li= new ArrayList<Stu_information>();
		Connection ctr=File_connect.getconnection();
		Statement sm=ctr.createStatement();
		String query="select * from my_table";
		
		ResultSet rs=sm.executeQuery(query);
		
		while(rs.next()) {
			Stu_information si=new Stu_information();
			si.setId(rs.getInt("id"));
			si.setName(rs.getString("Name"));
			si.setCity(rs.getString("city"));
			li.add(si);
		}
		
		for(Stu_information s:li) {
			System.out.println(+s.getId()+" "+s.getName()+" "+s.getCity());
			
		}
		
		
		
	}

}
