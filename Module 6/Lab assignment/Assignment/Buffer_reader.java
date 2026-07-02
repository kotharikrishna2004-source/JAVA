package Assignment;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffer_reader {	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\Core_Java\\\\src\\\\file_handling\\\\hello");
			BufferedReader br=new BufferedReader(fr);
			int i=0;
			while ((i=br.read())!=-1) {
				System.out.print((char)i);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}
		
	}

}
