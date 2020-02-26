package arrays;

public class Notes {
/*
 * we need to specify the size we cannot create the array
 * arrays use index based operation , position based operation
 * how to declare an array
 * insert , update , delete , read based on positions.

	syntax:
	int[] numbers = new int[5];  
	int array with 5 elements
	int numbers[] = new int[5];  


	String[] numbers = new String[6]; // string array with size of 6
	
	if size is n , insert from 0 to (n-1)
	  
//insert the elements
  	numbers[0]= 12;
	numbers[1]= 1;
  	numbers[2]= 17;
	numbers[3]= 125;
	numbers[4]= 16;
	
	
	
	//read elements
	System.out.println(numbers[0]);
	System.out.println(numbers[1]);
	System.out.println(numbers[2]);
	System.out.println(numbers[3]);
	System.out.println(numbers[4]);
	
	//read all for loop
	System.out.println("Print ALL using for loop");
	for (int i = 0; i < 5; i++) {
				System.out.println(numbers[i]);
	}
	
	//read all enhances for loop
	System.out.println("Print ALL using enhanced for  loop");
	for(int p : numbers){
				System.out.println(p);
	}
	
	search by position is very fast
	disadvantage: determine the size of the array
	cannot increase the size or decrease the size
	insert in between or delete in between is costly
	search by content is costly
	
	we can use Arrays.sort() to sort the array
 * 
 */
}
