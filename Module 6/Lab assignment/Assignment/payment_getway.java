package Assignment;
interface payment
{
	void withdraw();
	void checkbalance();
}

class quick implements payment
{
	public void withdraw()
	{
		System.out.println("Withdraw is 15000");
	}
	public void checkbalance()
	{
		System.out.println(" Balance is 25000");
	}
	}
public class payment_getway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quick q=new quick();
		q.checkbalance();
		q.withdraw();
	}

}
