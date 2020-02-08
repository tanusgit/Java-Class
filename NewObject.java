package object;

public class NewObject {
	//static means same value for each object
	String product = "";
	String brand = "";
	double price = 0;
	double discount = 0;

	public String getproduct() {
		return product;
	}

	public String getbrand() {
		return brand;
	}

	public double getprice() {
		return price;
	}

	public double getdiscount() {
		return discount;
	}

	public void setproduct(String p) {
		product = p;
	}

	public void setbrand(String b) {
		brand = b;
	}

	public void setprice(double p) {
		price = p;
	}

	public void setdiscount(double d) {
		discount = d;
	}


	
	
	public double productDiscount(String a, String b, double price, double discount) {
		product = a;
		brand = b;
		this.price = price;
		this.discount = discount;
		double res = price - ((discount * price) / 100);
		return res;

	}
	
	public static void main(String[] args) {
		//object orientation approach 
		NewObject n = new NewObject();
		 n.setproduct("Zara");
		 n.setbrand("b");
		 n.setprice(100.0);
		 n.setdiscount(25.0);
		 double b = n.productDiscount();
		 System.out.println(b);
		 
	}
	
	

	
	
	public double productDiscount() {
		double res = price - ((discount * price) / 100);
		return res;

	}
	
	
	
	

}
