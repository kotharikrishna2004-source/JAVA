package Assignment;
class hierarchy
{
	void grand()
	{
		System.out.println(" I am Grandfather");
	}
}
class father extends hierarchy
{
	void fat()
	{
		System.out.println(" I am father");
	}
}

class son extends father
{
	void so()
	{
		System.out.println(" I am son");
	}
}
public class Hierachy_multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son s=new son();
		s.so();
		s.fat();
		s.grand();
	}

}
