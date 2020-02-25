package scope2;

import scope1.Info;

//how to import a package
//import package name then class name

//import homework.ArrayString; cannot be imported as it is not in the same folder
//we can only import packages if they are in the same folder
import stringBuffer.Notes;
public class Info3 {
	public void show(){
		//access everything within class
		Info i = new Info();
		System.out.println(i.id); 
		//System.out.println(i.name);
		//default and protected cannot be accessed outside the package
	//	System.out.println(i.age);
	//	System.out.println(i.count);
		
		}

	} 