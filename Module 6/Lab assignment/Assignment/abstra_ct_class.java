package Assignment;
//parent class ya class
abstract class dumdum
{
	abstract void sound();
	void dhol()
	{
		System.out.println("Dum Dum");
	}
}
//subclass ya child class
class table extends dumdum
{
	 void sound()
	{
		System.out.println("Tup Tup ");
	}
}

public class abstra_ct_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table t=new table();
		t.sound();
		
	}

}
