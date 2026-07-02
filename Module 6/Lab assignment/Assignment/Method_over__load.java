package Assignment;

import java.util.Scanner;

class poly
{
	int a;
	void show()
	{
		System.out.println("value is : "+a);
	}
}

class my extends poly
{
	void show()
	{
		System.out.println(" Value is : "+a*a);
	}
}
public class Method_over__load {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		my m=new my();
		System.out.println(" Enter a number : ");
		m.a=sc.nextInt();
		m.show();
	}

}
