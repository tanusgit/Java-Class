package reflectionApimethodobject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
//how to create object for a class using reflection api
//ans: 
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		// creating object for Helper class
		Class c = Helper.class;
		Object obj = c.newInstance(); // Helper = new Helper()
		// how to call the method...
		// create the method object and call the method using the method object

		Method m = c.getDeclaredMethod("add", new Class[] { int.class, int.class });
		// to call add()
		m.invoke(obj, 4, 5);
		//print() does not have any input argument so we passed null
		Method m1 = c.getDeclaredMethod("print", null);
		m1.invoke(obj, null);
	}

}
