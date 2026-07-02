package Assignment;
import java.util.Scanner;
class student
{
	String Name;
	int age;
	
	void display()
	{
		System.out.println(" Name is : "+Name);
		System.out.println(" Age is : "+age);
	}
}
public class Student_info {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your Name :");
		s.Name=sc.nextLine();
		System.out.println(" Enter your Age :");
		s.age=sc.nextInt();
		s.display();
		
		
	}

}
