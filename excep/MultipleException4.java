package excep;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MultipleException4 {

	public static void main(String[] args) {

		File file = new File("123rrr.txt");
		int data = 0;
		
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);

			while ((data = fis.read()) != -1) {
				System.out.println((char) data);
			}

		}

		catch (IOException e1) {

			e1.printStackTrace();
		}

		finally {
			
				try {
					if (fis != null) fis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
		}
	}

}
