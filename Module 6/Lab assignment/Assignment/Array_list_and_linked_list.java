package Assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_list_and_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//make a list
		//continuous order
		List<String>list=new ArrayList<String>();
		list.add("sanjay");
		list.add("Rahul");
		list.add("Raman");
		list.add("sanjay");
		
		System.out.println(list);
		for (String str : list) {
			System.out.print(str+" ");
		}
		System.out.println();
		//Linked list
		//non -continuous
		List<String>li=new LinkedList<String>();
		li.add("Banana");
		li.add("Mango");
		li.add("Apple");
		li.add("Mango");
		
		System.out.println(li);
		
		for (String sdm : li) {
			System.out.print(sdm+" ");
		}
	}

}
