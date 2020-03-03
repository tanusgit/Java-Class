package fileOperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	/*
	 * FileWriter examples:
------------------------
  1.Create file obj
2.Create FileWriterObj using file obj
3.use write() method to write the data to the file [pass string ]
4.close filewriter
	 */
	
	public static void main(String args[]) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("/home/td/Desktop/Java/HomeworkJava/testFile.md");
			fw.write("Hi\n   ");
			fw.write("Tanu");

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				System.out.println("file close failed.");
			}
		}
		System.out.println("Success...");
	}

}
