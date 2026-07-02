package Assignment;

public class try_catch_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
		int b=0;
		
		try {
			int c=a/b;
			if (b==0) {
				
				throw new Exception(" b value is 0");
			} else {
				System.out.println("Result is : "+c);
			}
		} catch (Exception e) {
			// TODO: handle exception
				System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("Always print");
		}
		
	}

}
