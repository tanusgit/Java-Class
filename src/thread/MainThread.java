package thread;

public class MainThread extends Thread{
	

		public void run() {
			System.out.println("Thread stated:" + Thread.currentThread().getId() + " is running");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread ended" + Thread.currentThread().getId() + " ended");
		}

	  
	  public static void main(String[] args) throws InterruptedException {
			System.out.println("main: start");
			Thread th1 = new MainThread();
			th1.setName("my Thread1");
			
			Thread th2 = new MainThread();
			th2.setName("my Thread2");
			
			Thread th3 = new MainThread();
			th3.setName("my Thread3");
			
			th1.start();
			th2.start();
			th3.start();
	    //main thread has to wait until th1, th2 gets executed 
		//join() is used to make the thread wait 
		//th1, th2 are in sleeping state and main() is in waiting state
			th1.join();
			th2.join();
			th3.join();
			System.out.println("main: end");
		}
	  
	  
	}


