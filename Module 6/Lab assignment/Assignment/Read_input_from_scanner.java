package Assignment;

import java.util.Scanner;

public class Read_input_from_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Hello, " + name + "!");
	}

}
