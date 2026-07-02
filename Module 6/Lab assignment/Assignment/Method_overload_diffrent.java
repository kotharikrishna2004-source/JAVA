package Assignment;

public class Method_overload_diffrent {
	static void myfun(int a)
	{
		System.out.println("value is :"+a);
	}
	
	static void myfun(String Name)
	{
		System.out.println(" Name is : "+Name);
	}
	static void myfun(float f)
	{
		System.out.println(" Float value : "+f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myfun(4);
	}

}
