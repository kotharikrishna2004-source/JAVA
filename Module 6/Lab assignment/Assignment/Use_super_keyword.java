package Assignment;
class pehla
{
	pehla(String Name)
	{
		System.out.println(" Name is : "+Name);
	}
	
	void show(int a)
	{
		System.out.println(" Value is :"+a);
	}
}

class dusra extends pehla
{

	dusra(String Name) {
		super(Name);
		System.out.println(" Name is : "+Name);
		// TODO Auto-generated constructor stub
	}
	
	void my(int a)
	{
		super.show(a);
		System.out.println(" Value is : "+a);
		
	}
	
	
}
public class Use_super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dusra d=new dusra("Sanjay");
		dusra k=new dusra(null);
		k.my(3);
		
	}

}
