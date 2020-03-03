package fileOperations;

import java.io.File;

public class ReadallFiles {
	public static void main(String[] args) {
		// READ all files/folders inside folder
		File f1 = new File("/home/td/Desktop/Java/HomeworkJava");
		File[] listFiles = f1.listFiles();
		for (File f : listFiles) {
			boolean isFile = f.isFile();
			boolean isDir = f.isDirectory();

			System.out.println((isFile ? "FILE " : "DIR ") + f.getName());
		}
	}
}
