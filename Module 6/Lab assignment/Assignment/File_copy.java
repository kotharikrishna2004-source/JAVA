package Assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Core_Java\\src\\file_handling\\hello");   // source file
            fos = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Core_Java\\src\\file_handling\\reading"); // destination file

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
	}

}
