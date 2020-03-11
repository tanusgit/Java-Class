package thread;

public class ThirdApproachforThread {
	public static void main(String[] args) throws InterruptedException {
		  System.out.println("main :start");
		   //approach1
		   Runnable r1 = new Runnable() {
					@Override
					public void run() {
						System.out.println(Thread.currentThread()+"running thread ");
					}
				};
				
				Thread  th1 = new Thread(r1);
		   
		   //approach2
		   Runnable r2 = () ->{
					System.out.println("thread1 ");
				};
				Thread  th2 = new Thread(r2);
		   
		   
			Runnable r3 = () ->{
				System.out.println(" third thread");
			};
			Thread th3 = new Thread(r3);
				
				
				
		   //start threads
		   th1.start();
		   th2.start();
		   th3.start();
				System.out.println("main :end");
		 }
}
