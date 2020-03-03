package fileOperations;

import java.io.File;

public class CreateFolder {
public static void main(String[] args) {
	File f1 = new File("/home/td/Desktop/Java/test12");
	f1.mkdir();
	
	//to delete a folder 
	f1.delete();
}
}
