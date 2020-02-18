package interfacE;

public class Test {
	public static void main(String[] args) {
		//overiding is mandatory for all the clases
		Rbi h = new Hdfc();
		h.createAccount();
		h.createPPF();
		h.getKYC();
		
	}

}
