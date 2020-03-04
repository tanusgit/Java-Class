package reflectionApi;

import java.lang.reflect.Field;

public class TestEmployee {
//print the field names of employee class
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//get the class object
		Class  classObj = Class.forName("reflectionApi.Employee");
		Field[] fields = classObj.getDeclaredFields();
	
		//get the field objs for the instance variables
		for(Field field: fields){
			System.out.println(field.getName());
			//get the data type of the field name
			 System.out.println("Datatype of the variable :" + field.getType());
		}
		
		
}
}
