package Assignment;

import java.util.Scanner;

public class two_dimentsion_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int array[][]=new int[3][3]; //row and column initialize
		int sum=0;
		int sub=0;
		//input a number
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <3; j++) {
				System.out.println(" Enter a number : ");
				array[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <3; j++) {
				System.out.print(array[i][j]+" ");
				sum=sum+array[i][j];
				sub=sub-array[i][j];
				
				
		}
			System.out.println();
	
	}
		System.out.println(" sum is : "+sum);
		System.out.println(" sub is : "+sub);
}
}
