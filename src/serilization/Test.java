package serilization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String args[]) throws Exception {
		Student s1 = new Student(5000, "user2", 1234);
		
		File f = new File("objectforSerilization.txt");
		//write the file but we need to write a lot of lines 
		FileOutputStream fout = new FileOutputStream(f);
		//but with objectoutputstream we can create an  object with 1 line of code
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s1);
		
		out.flush();
		System.out.println("success");
	}

}
