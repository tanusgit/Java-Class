package fileOperations;

import java.io.File;

public class FileDelete {
	public static void main(String[] args) {

		// DELETE File:

		File file = new File("/home/td/Desktop/Java/test10/test.txt");
		if (file.exists()) {
			file.delete();
		}
	}
}
