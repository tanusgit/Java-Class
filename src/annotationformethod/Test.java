package annotationformethod;
import java.util.Date;

public class Test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Creating date
		Date d1 = new Date(2017, 1, 21);
		Date d2 = new Date(); 
		 
		System.out.println(d1.compareTo(d2));
  
}
}
