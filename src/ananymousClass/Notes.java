package ananymousClass;

public class Notes {
/*/* *Anonymous Inner Class: *------------------------------------ ==>
 * Sometimes we can write a class without any name such type of nameless classes 
 * are called anonymous inner class */
	//public class AnonymousInnerClass { 
	public static void main(String[] args) {
		Runnable r1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Child Thread :" + i);
				}
			}
		};
		Thread t1 = new Thread(r1);

		t1.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Parent Thread :" + i);
		}

	}
}
