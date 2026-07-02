package Assignment;

import java.util.Scanner;

public class odd_even_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a number : ");
		int n=sc.nextInt();
		if (n%2!=0) {
			System.out.println(" Number is odd");
		} else {
			System.out.println(" Number is even");
		}
	}

}
