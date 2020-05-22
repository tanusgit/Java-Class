package interviewQuestions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSave {
	public static void main(String[] args) throws IOException {
		//create a folder
		File f = new File("/home/td/Desktop/Java/testfile");
		f.mkdir();
		//create a file
		f = new File("/home/td/Desktop/Java/testfile/test1.txt");
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
		}catch(Exception e){
			
		}
		FileOutputStream fos = new FileOutputStream(f);
		try {
			fos.write("Mina, kina".getBytes());
			fos.write("\r\n".getBytes());
			fos.write("where are you?".getBytes());
		} catch (Exception ex) {

		} finally {
			fos.close();
		}
		
		
		
		
	}
}
