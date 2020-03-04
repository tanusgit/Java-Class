package reflectionApi;

import java.lang.reflect.Field;

public class Test4ObjectData {
//printing object data using reflectionAPi

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		// get the class object
		Class classObj = Class.forName("reflectionApi.Employee");
		Field[] fields = classObj.getDeclaredFields();
		Employee e = new Employee();
		// get the field objs for the instance variables
		//get() getName() is in Field class
		for (Field field : fields) {
			System.out.println(field.getName() + " = " + field.get(e));
		}
	}

}
