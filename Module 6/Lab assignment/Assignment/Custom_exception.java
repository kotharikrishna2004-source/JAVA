package Assignment;
class jay extends Exception
{
	jay(String msg)
	{
		super(msg);
	}
	
	void show()
	{
		System.out.println(" User define ");
	}
}
public class Custom_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3};
		try {
			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
				throw new jay("check index");
			}
			
		} catch (jay e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
