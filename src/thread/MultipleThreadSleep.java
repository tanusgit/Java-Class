package thread;

public class MultipleThreadSleep extends Thread {
//sleep operation with multiple thread 
	public void run() {
		System.out.println("Thread stated:" + Thread.currentThread().getId() + " is running");
		try {//thread is waiting for 5 seconds after main thread
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println("Thread ended" + Thread.currentThread().getId() + " ended");
		System.out.println("Thread ended" + Thread.currentThread().getName() + " ended");
	}

	public static void main(String[] args) {
		System.out.println("main: start");
		Thread th1 = new MultipleThreadSleep();
		th1.setName("my Thread1");
		

		Thread th2 = new MultipleThreadSleep();
		th2.setName("my Thread2");

		Thread th3 = new MultipleThreadSleep();
		th3.setName("my Thread3");

		th1.start();
		th2.start();
		th3.start();
		System.out.println("main: end");
	}

}
