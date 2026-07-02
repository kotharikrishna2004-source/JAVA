package Assignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\Core_Java\\src\\file_handling\\user");     // source file
            fw = new FileWriter("C:\\Users\\Lenovo\\eclipse-workspace\\Core_Java\\src\\file_handling_using_char\\hey");    // destination file

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            System.out.println("File content copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                if (fr != null)
                    fr.close();
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
	}

}
