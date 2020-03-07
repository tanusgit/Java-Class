package threadsynchronization;

public class MyThread extends Thread {

	Person person;

	public MyThread(Person person) {
		super();
		this.person = person;
	}
	
	public void run() {
		try {
			Thread.sleep(7000);
      synchronized (this.person) {//block , this block is executed one thread at a time.
			person.count = person.count + 5;
      }
      
    } catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	
	
//thread is trying to modify the person object by incrementing the count variable by 5
	/*public void run() {
		try {
			Thread.sleep(3000);
			person.count = person.count + 5;
    } catch (InterruptedException e) {
			e.printStackTrace();
		}
	}*/


class Person {
	int count;
	public Person(int count) {
		super();
		this.count = count;
	}
}

