package thread;

public class Test {

	 public static void main(String[] args) throws InterruptedException {
			System.out.println("start");
			
	   //create thread obj
	   Thread th1 = new MyThread();
			th1.setName("my Thread1");
			th1.setPriority(10);
	   
	   //start thread adn add to cpu job list
	   th1.start();
	   
	   System.out.println("Bye");
	   
	 }
}
