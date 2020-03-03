package fileOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStream {
	/*
	 * Fileoutputstream example:
-----------------------
1.Crate file obj
2.Create Fileoutputstream using file obj
3.use write() method to write the data to the file [pass bytes]
byte data type can be used to create any kind of file
4.close filewriter
	 */
	
	public static void main(String[] args) throws IOException {
		File file = new File("/home/td/Desktop/Java/HomeworkJava/testFile.properties");
		FileOutputStream fos = new FileOutputStream(file);
		try {
			fos.write("krishna,28,1313".getBytes());
			fos.write("\r\n".getBytes());
			fos.write("where are you?".getBytes());
		} catch (Exception ex) {

		} finally {
			fos.close();
		}
	}

}
