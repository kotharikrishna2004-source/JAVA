package Assignment;
class papa
{
	void declare()
	{
		System.out.println(" My Name is Shree");
	}
	
}

class baccha extends papa
{
	void declare()
	{
		System.out.println(" My Name is Jayvir ");
	}
}
public class run_time_poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baccha b=new baccha();
		b.declare();
	}

}
