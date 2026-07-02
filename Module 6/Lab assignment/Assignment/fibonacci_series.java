package Assignment;

import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		int t1=0;
		int t2=1;
		int next;
		System.out.println( "Ente a range : ");
		n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			System.out.println(t1+" ");
			next=t1+t2;
			t1=t2;
			t2=next;
		}
	}

}
