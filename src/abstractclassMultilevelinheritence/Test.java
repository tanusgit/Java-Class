package abstractclassMultilevelinheritence;

public class Test {
public static void main(String[] args) {
	//object is creating for Hdfc
	RBI h = new Hdfc();
	h.createPPF();
	h.createPPF();
	h.getKYC();
}
}
