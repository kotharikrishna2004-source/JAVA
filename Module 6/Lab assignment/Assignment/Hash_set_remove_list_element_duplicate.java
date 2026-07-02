package Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hash_set_remove_list_element_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multiple type in list
		List li=new ArrayList();
		li.add("sanjay");
		li.add(123);
		li.add(10.10);
		li.add("sanjay");
		
		System.out.println(li);
		for (Object obj : li) {
			System.out.println(obj);
		}
		//multiple ke liye
		//set 
		Set s=new HashSet();
		s.addAll(li);
		System.out.println(s);
		
	
		
		
	}

}
