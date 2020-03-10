package java8;

public class ServiceTest {
public static void main(String[] args) {
	Service s = new Service() {
		//it is mandatary as it is an abstract method
		@Override
		public void process(String str) {

			System.out.println("i am angry with you");
			
		}
	};
	//not mandatory to override default method
	//static method can't be overridden
	s.process("ss");
	s.log("hello");
	Service.print("Spring");
}
}
