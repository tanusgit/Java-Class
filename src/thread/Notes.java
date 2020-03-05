package thread;

public class Notes {
	/*
	 * threading is used for parallel programming. 
	 * Parallel programming means Executing multiple programs at the 
	 * time. we call it as countering program
	 * advantage of thread:
	 * response time is improved
	 * thread is a single unit created under the process
	 * every thread has its own line of execution, every thread is independent
	 * eclipse, skype, chrome are processes
	 * every process requires separate memory
	 * every thread does not require separate memory
	 * all the threads share the same memory which is allocated for the process
	 * 
	 * when should we use thread?
	 * when the tasks are independent of each other, means the output
	 * of one task is not required for the another task
	 * when the thread is created it would not start immediately, because it is decided
	 * by the cpu, then it would run
	 * 
	 * we cannot determine when the thread would start or end.
	 * 
	 * thread states:
	 * 1. ready state -- when the developer creates the thread and adds to the cpu job list
	 * 2. running -- when cpu gives appointment to the thread
	 * 3. possible 3 states after running state
	 * 		a. dead state or completed state
	 * 		b. wait state : we don't know the time
	 * 		c. sleep state : we will know for how long it is going to know sleep
	 * 
	 * by default java creates the main thread
	 * using the main thread developer will create the additional threads
	 * 
	 * 
	 * 
	 * how to create a thread:
	 * 1. create the thread class and provide run method
	 * 2. create the thread object
	 * 3. call the start method----ready state-- start method calls the run method when
	 * the cpu is available
	 * 
	 * run method tells what the thread has to do
	 * 
	 * 
	 * create the thread class:
    ----------------------------
    a. extending Thread and provide run method
    	public class MyThread extends Thread {
								public void run() {
											System.out.println("Hi");
								}
		  	}

    b.implements Runnable  and provide run method
      public class MyThread implements Runnable {
								public void run() {
											System.out.println("Hi");
								}
		  	}
		  	
		  	
		to print any thread name  :
		System.out.println(Thread.currentThread());
		
		whatever we would write in run method only that would get executed 
	 * 
	 */

}
