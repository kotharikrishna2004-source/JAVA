package Assignment;
class capsulate
{
	private int age;
	private String Name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}
public class Encapsulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		capsulate c=new capsulate();
		c.setName("Shree Ram");
		c.setAge(22);
		System.out.println(" Name is : "+c.getName());
		System.out.println( "Age is : "+c.getAge());
	}

}
