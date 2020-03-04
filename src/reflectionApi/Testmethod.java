package reflectionApi;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Testmethod {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//get the class object
		Class  classObj = Class.forName("reflectionApi.Employee");
	
	 		//get the method objs for the methods
		Method[] methods = classObj.getMethods();
		for(Method method: methods){
			System.out.println(method.getName());
		}
}
}
