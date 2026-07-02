package Assignment;

import java.io.FileInputStream;

public class file_wtrite_read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin= new FileInputStream("C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\Core_Java\\\\src\\\\file_handling\\\\hello");
			int i=0;
			while ((i=fin.read())!=-1) {
				System.out.print((char)i);
			}
			fin.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
