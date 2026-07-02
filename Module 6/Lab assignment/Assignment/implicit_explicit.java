package Assignment;

public class implicit_explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit
		int a=5;
		double b=a;
		System.out.println("implicit is :"+b);//automatic le lega
		
		//explicit
		float c=6.5f;
		int d=(int)c;
		System.out.println("explicit is :"+d);
	}

}
