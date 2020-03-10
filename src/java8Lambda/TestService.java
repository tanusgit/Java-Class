package java8Lambda;

public class TestService {
	public static void main(String[] args) {
		// approach1 for creating anonymous class
		Service s = new Service() {

			@Override
			public void process() {
				System.out.println("hello");
				System.out.println("Spring is very beautiul here");

			}
		};
		s.process();
		
		// approach2 using lambda and anonymous class
		//create the child class for Service interface and override the process method
		//and create the child object
		Service s1 = () -> {
			System.out.println("hello");
			System.out.println("Spring is very beautiul here");
			
	};
	s1.process();
	
	Service s2 = () ->{
		System.out.println("ok");
	};
	s2.process();
}
}
