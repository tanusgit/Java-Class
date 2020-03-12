package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestProduct {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		// Adding Products
		products.add(new Product(1, "HP Laptop", 25000f));
		products.add(new Product(2, "Dell Laptop", 30000f));
		products.add(new Product(3, "Lenevo Laptop", 28000f));
		products.add(new Product(4, "Sony Laptop", 28000f));
		products.add(new Product(5, "Apple Laptop", 90000f));
		products.add(new Product(6, "Dell Laptop", 100000f));


		List<String> productPriceList = new ArrayList<String>();
		// approach1
		for (Product p : products) {
			// filtering data of list
			if (p.price < 30000) {
				productPriceList.add(p.name); // adding name to a
												// productPriceList
			}
		}

		System.out.println(productPriceList); // displaying data

		// approach2 filter() will not return boolean
		Set<String> names = products.stream().filter(p -> p.price < 30000)
				.map(p -> p.name).collect(Collectors.toSet());
		System.out.println(names);
		
		
		//not creating the list. so, not creating a new list
		 System.out.println("***************print names whose price<30000*************************");
		products.stream().filter( p-> p.price==30000)
			.forEach( p -> System.out.println(p.name));
		
		//to sum all the prices
		System.out.println("******************final sum *******************");
		double totalPrice3 = products.stream().collect
				(Collectors.summingDouble(product -> product.price));
		System.out.println(totalPrice3);
		
		//anyMatch() will only check if the desired value is there or not
		//once it finds the value it returns a boolean 
		 System.out.println("****************any product whose price is less thean 10k*******************");
			boolean found = products.stream().anyMatch(p -> p.price < 10000);
			if(found) {
				System.out.println("product found");
			}else {
				System.out.println("product not found");
			}
		
			
			System.out.println("****************any product whose price is less thean 10k*******************");
			 found = products.stream().filter(p -> p.name.contains("dell")).anyMatch(p -> p.price < 10000);
			if(found) {
				System.out.println("product found");
			}else {
				System.out.println("product not found");
			}
			
			//get the single product object which comes first in the list from the list based on the name 
			//if found return the product else return null
			 System.out.println("*********get single dell instance 1*************");
				Product pro = products.stream()
					      .filter(e -> e.name.equals("Dell Laptop"))
					      .findFirst()
					      .orElse(null);
				System.out.println(pro);
				
				System.out.println("*********get single dell instance 2*************");
				
				pro = products.stream()
					      .filter(e -> e.name.equals("Dell"))
					      .findFirst()
					      .orElse(null);
				System.out.println(pro);
				
				
				//return the single object which has the maximum price
				System.out.println("******print max price**********");
				Product p = products
				.stream()
				.max( (p1,p2) -> (int)(p1.price - p2.price))
				.get();
				System.out.println(p);
				
				//count the number of laptops whose price is more than 30000
				 // count number of products based on the filter
				System.out.println("******count of price <30000********");
				long count = products
						.stream()
						.filter(product -> product.price < 30000)
						.count();
				System.out.println(count);
				
				
			
	}

}
