package Assignment;

public class max_of_three {
	public static void max(int a,int b,int c)
	{
		if (a>b) {
			if (a>c) {
				System.out.println(" Max is : "+a);
			} else {
				System.out.println(" Max is : "+c);
			}
			
		} else {
			if (b>c) {
				System.out.println(" Max is : "+b);
			} else {
				System.out.println(" Max is : "+c);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max(9,7,4);
	}

}
