package fileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Fileinputstream {
	/*
	 * Fileinput stream: --------------- 1.Create file obj 2.Create
	 * FileInputStream(fis) using file obj 3. create BufferedReader using fis 4.use
	 * readLine() method to read the data from file (bye by byte) 5.close
	 * BufferedReader 6.close FileInputStream
	 */

	public static void main(String args[]) throws Exception {

		// specify file info
		File fileIn = new File("/home/td/Desktop/Java/HomeworkJava/testFile.properties");

		FileInputStream fis = new FileInputStream(fileIn);

		BufferedReader br = new BufferedReader(new InputStreamReader(fis));

		try {
			String read;
			while ((read = br.readLine()) != null) {
				System.out.println(read);
			}
		} catch (Exception ex) {

		} finally {
			fis.close();
			br.close();
		}
	}

}
