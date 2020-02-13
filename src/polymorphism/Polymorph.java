package polymorphism;

public class Polymorph {
	
	/*
	 * polymorphism: --------------------- -
	 * exhibiting the features in differnt forms. 
	 * 
	 * two polymorphism
	 * 1.compile time(related to polymorphism) 
	 * compiletime poly: ------------- - also called as method overloading . 
	 * same class has some 
	 * within the same class
	 * we can have different methods having same method name
	 * but different method signature. 
	 * ex.
	 * public class Calc{
	 *  public void show(){ } 
	 *  public void show(int x){ } 
	 *  public void show(float x){ } } 
	 *  Method signature: -> no of args -> order of args -> data type of args 
	 *  return type is not part of method signature
	 *  No of args: ------------ 
	 *  public int add(int a, int b) 
	 *  { 
	 *  int sum = a + b; return sum; 
	 *  } 
	 *  public int add(int a, int b , int c) 
	 *  { 
	 *  int sum = a + b+c; return sum; 
	 *  } 
	 *  order of the arguments.............
	 *   public void add(int a, float b )
	 *    { 
	 *    System.out.println(a + b); 
	 *    } 
	 *    public void add(float a, int b )
	 *     {
	 *      System.out.println(a + b); 
	 *      } 
	 *  datatype of args: ------------- 
	 *  public long add(long a, long b ) 
	 *  { long sum = a + b; return sum; }
	 *   public float add(float a, float b )
	 *   { float sum = a + b; return sum; } 
	 *  
	 * 
	 * 2.run time (*related to inheritance)
	 */
}
