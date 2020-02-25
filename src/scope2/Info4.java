package scope2;

import scope1.Info;;

public class Info4 extends Info { 
	public void show(){ 
		//access everything within class 
		System.out.println(id); 
		//System.out.println(name);
		//protected is applicable for inheritence
		System.out.println(age);
		//System.out.println(count);
	}
}
	
