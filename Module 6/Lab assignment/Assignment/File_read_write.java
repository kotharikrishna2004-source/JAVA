package Assignment;

import java.io.FileOutputStream;

public class File_read_write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fo=new FileOutputStream("C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\Core_Java\\\\src\\\\file_handling\\\\hello");
			String s="Hello jayvir ";
			byte arr[]=s.getBytes();
			fo.write(arr);
			System.out.println(" Succesfully ");
			fo.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
