package Assignment;
class hii
{
	//static variables ko khi bhi use kr skte hai but class main krenge to class ka name use hoga
	static int age=20;
	static String Name="sanjay";
	
	static void fun()
	{
		System.out.println("Hello My World !");
	}
}
public class static_variables_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hii.age);
		System.out.println(hii.Name);
		hii.fun();
		
	}

}
