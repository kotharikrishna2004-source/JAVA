package Assignment;

public class pelin_check_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="LoL";
		String rev="";
		
		for (int i = s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(" Rev is :"+rev);
		
		if(s.equals(rev))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println(" no");
		}
	}

}
