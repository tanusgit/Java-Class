package scope2;

import scope1.Info;

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