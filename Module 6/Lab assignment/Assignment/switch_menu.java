package Assignment;

import java.util.Scanner;

public class switch_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int select;
		int n;
		char choose;
		int rupee;
		int prise;
		int total=0;
		do {
			System.out.println(" 1. Pizza=100rs/pcs ");
			System.out.println(" 2. Burger=50rs/pcs ");
			System.out.println(" 3. Pasta=75rs/pcs ");
			System.out.println(" 4. exit ");
			
			System.out.println("Choose a item of a number do you want :");
			select=sc.nextInt();
			switch (select) {
			case 1:
					prise=100;
					System.out.println(" You select pizza ");
					System.out.println(" How pizza you want :  ");
					n=sc.nextInt();
					System.out.println(" You select Pizza : "+n);
					rupee=n*prise;
					System.out.println(" Rupees of item is : "+rupee);
					total+=rupee;
					System.out.println(" Total amount is : "+total);
					
				break;
			case 2 :
				prise=50;
				System.out.println(" You select Burger ");
				System.out.println(" How Burger you want :  ");
				n=sc.nextInt();
				System.out.println(" You select Burger : "+n);
				rupee=n*prise;
				System.out.println(" Rupees of item is : "+rupee);
				total+=rupee;
				System.out.println(" Total amount is : "+total);
				break;
			case 3:
				prise=75;
				System.out.println(" You select paste ");
				System.out.println(" How pasta you want :  ");
				n=sc.nextInt();
				System.out.println(" You select Pasta : "+n);
				rupee=n*prise;
				System.out.println(" Rupees of item is : "+rupee);
				total+=rupee;
				System.out.println(" Total amount is : "+total);
				break;
			case 4:
				break;
			default: System.out.println( "Enter Correct alternative");
				break;
			}
			System.out.println(" If You Want to take more order press (Y/y)?");
			choose=sc.next().charAt(0);
			
		} while (choose=='Y' || choose=='y');
	}

}
