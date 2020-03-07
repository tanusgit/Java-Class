package thread;

public class SleepInThread extends Thread{
	//one thread
	public void run() {
		String data = "Java is a programming language";
			int i;
			for (char ch:  data.toCharArray()) {
				System.out.print(ch);
				try {// 250 milliseconds
					Thread.sleep(250);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		System.out.println();
	}
	
	public static void main(String args[]) {
		Thread t1 = new SleepInThread();
		t1.start();
	}
}



