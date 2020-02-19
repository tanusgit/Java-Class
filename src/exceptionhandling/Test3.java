package exceptionhandling;

public class Test3 {
	public static void main(String[] args) {
	/*	String name = null;
		int len = name.length();
		System.out.println("length = " + len);

	}
//throws nullpointer exception == if you do not create the object and
	//try to access the object
}*/
	
			String name = null;
			try {
				System.out.println(name.length());
			} 
			catch (NullPointerException ex) {
				// ex.printStackTrace();
				System.out.println("obj is null:"
						+ ex.getMessage());
			} 
			finally {
				System.out.println("Program ends");
			}
		}		
		
		
		
	}
