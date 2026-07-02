package Assignment;

public class compare_to_equals_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first="Hello";
		String second="Hello";
		//equals method statement ko check krega
		if (first.equals(second)) {
			System.out.println(" Same statement");
		} else {
			System.out.println(" Different statement");
		}
		
		if (second.compareTo(first)==0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}

}
