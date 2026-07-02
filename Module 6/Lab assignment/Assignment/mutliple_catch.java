package Assignment;

public class mutliple_catch {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,4,5};
		try {
			for (int i = 0; i <= array.length; i++) {
				System.out.print(array[i]);
			}
			throw new Exception("Exception");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		catch(ClassNotFoundException e)
		{
			 System.out.println(e.getMessage());
		}
		
	}

}
