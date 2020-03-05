package reflectioAPIconstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class TestEmployee {
	public static void main (String[] args) {
		// Create Class object for Emp.class 
		Class classObj=Employee.class;

		// Get all the constructor information in the Constructor array
		Constructor[] constList = classObj.getDeclaredConstructors();
		
		for (Constructor constructor : constList) {
			// Print all name of each constructor
			System.out.println("Constrcutor name : "+constructor.getName());
			constructor.setAccessible(true);
			
			//Get and print access modifiers of each constructor 
			int modifiers= constructor.getModifiers(); 
			System.out.println ("Constrctor modifier : "+Modifier.toString(modifiers));
			
			// Get and print parameter types 
			Class[] constrParams=constructor.getParameterTypes();
			System.out.print ("Constrctor parameter types :"); 
			for (Class class1 : constrParams) { 
				System.out.println(class1.getName() +" ");
			}
			 
			System.out.println("*******************************************");
		}
	}
}
