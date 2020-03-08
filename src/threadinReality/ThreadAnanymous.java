package threadinReality;

public class ThreadAnanymous {
	//reducing unnecessary class creation
		public static void main(String args[]) {
	    	System.out.println("main :start");
	    
			Runnable r3 = new Runnable() {
				@Override
				public void run() {
					System.out.println("running thread ");
				}
			};
			
			Thread  th3 = new Thread(r3);
			
			th3.start();
		 
			System.out.println("main :end");
		 
		}
	}


