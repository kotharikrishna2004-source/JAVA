package Assignment;
 class makesound
{
	 void sound()
	 {
		 System.out.println(" All Make Sound");
	 }
}

class sparrow extends makesound
{
	void makesound()
	{
		System.out.println(" Sparrow Make sound");
	}
}
public class single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sparrow s=new sparrow();
		s.makesound();
		s.sound();
	}

}
