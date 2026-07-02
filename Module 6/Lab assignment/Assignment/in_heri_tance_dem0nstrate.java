package Assignment;
class dollar
{
	void show()
	{
		System.out.println(" Value in rupee is :90 ");
	}
}

class rupee extends dollar
{
	void declare()
	{
		System.out.println(" Value is :1 ");
	}
}
public class in_heri_tance_dem0nstrate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rupee r=new rupee();
		r.declare();
		r.show();
	}

}
