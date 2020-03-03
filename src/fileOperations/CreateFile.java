package fileOperations;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		 File file = new File("/home/td/Desktop/Java/test10");
			
			file.mkdir();
			
			
			file = new File("/home/td/Desktop/Java/test10/test.txt");
			try {
				if(!file.exists())
					//create a file
					file.createNewFile();
			} catch (IOException e) {
				System.out.println("file creation failed");
			}
			
			
			
	}

}
