package functionalInterface;

public class FunctionalInterfaceChild {
public static void main(String[] args) {
	FunctionalInterfaceEx f = new FunctionalInterfaceEx() {
		
		@Override
		public void process(String str) {
			if(str.length() < 5) {
				System.out.println(" not too big");
			}
			else {
				System.out.println("Yeah it is big");
			}
			
		}
	};
	f.process("Not listening to you");
}
}
