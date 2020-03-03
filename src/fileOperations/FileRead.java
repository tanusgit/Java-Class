package fileOperations;

import java.io.FileReader;

public class FileRead {
	/*
	 
	 FileReader:
----------------

1.Create file obj
2.Create FileReader using file obj
3.use read() method to read the data from file (read char by char)
4.close FileReader
	 
	 
	 */


	 public static void main(String args[])throws Exception{    
	          FileReader fr=new FileReader("/home/td/Desktop/"
	          		+ "Java/HomeworkJava/testFile.md");    
	          int i;    
	          while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
	          fr.close();    
	    }
	
}
