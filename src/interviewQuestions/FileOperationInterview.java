package interviewQuestions;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class FileOperationInterview {

	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\user\\Desktop\\WORGbHi8bXhDyMP2m1NDUSiYmznAJdJzX36DDdemo.txt");
		File f1=new File("C:\\Users\\user\\Desktop\\WORGbHi8bXhDyMP2m1NDUSiYmznAJdJzX36DDdemo1.txt"); 
		FileWriter fw=new FileWriter(f1);
		FileReader fr=new FileReader(f); 
		int i=fr.read(); 
		while(i!=-1) 
		{ fw.write(i); 
		fw.flush(); 
		i=fr.read(); } }
}
