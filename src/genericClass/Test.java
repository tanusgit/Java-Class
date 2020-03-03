package genericClass;

public class Test<E> {

		private E data;
		
		public E get(){
			return this.data;
		}
		
		public void set(E t1){
			this.data=t1;
		}
		public static void main(String[] args) {
			Test<String> data = new Test<String>();
			data.set("hello");
			String str = data.get();
			System.out.println(str);
			
			Test<Integer> data1 = new Test<Integer>();
			data1.set(23);
			int d = data1.get();
			System.out.println(d);
			
			Test<Employee> empType= new Test<Employee>();
			Employee pObj = new Employee(123, "aaaa",67);
			empType.set(pObj);
			Employee p = empType.get();
			System.out.println(p);
	  
	}
	
}
