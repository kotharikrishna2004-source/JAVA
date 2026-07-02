package Assignment;

import java.util.Scanner;

public class calculator {
	int a,b;
	void add() {
	
		System.out.println("The sum is: " + (a + b));
	}
	
	void subtract() {
		
		System.out.println("The difference is: " + (a - b));
	}
	void multiply() {
		
		System.out.println("The product is: " + (a * b));
	}
	void divide() {
		
		if (b != 0) {
			System.out.println("The quotient is: " + (a / b));
		} else {
			System.out.println("Error: Division by zero is not allowed.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		calculator c=new calculator();
		System.out.println("Enter first number : ");
		c.a=sc.nextInt();
		System.out.println(" Enter second number :");
		c.b=sc.nextInt();
		c.add();
		
		
		
	}

}
