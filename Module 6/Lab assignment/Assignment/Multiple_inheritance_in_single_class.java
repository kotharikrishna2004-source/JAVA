package Assignment;
interface america
{
	void language();

}

interface india
{
	void boli();
	
}

class take implements america , india
{
	public void language()
	{
		System.out.println(" American language is English ");
	}
	
	public void boli()
	{
		System.out.println(" Indian language is hindi");
	}
}
public class Multiple_inheritance_in_single_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		take t =new take();
		t.boli();
		t.language();
	}

}
