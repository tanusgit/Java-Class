package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestEmployeeProject {
	public static void main(String[] args) {
		Map<Employee, Project> map = new HashMap<>();
		
		Employee e1 = new Employee("user1",1);
		Employee e2 = new Employee("user2",2);
		Employee e3 = new Employee("user3",3);
		
		Project p1 = new Project(12,"pro1");
		Project p2 = new Project(13,"pro2");
		Project p3 = new Project(14,"pro3");
		
		//keep the data in map
		map.put(e1, p1);
		map.put(e2, p2);
		map.put(e3, p3);
		
		/*System.out.println("**** print map  ****");
		printMap(map);
		
		System.out.println("**** add e4  ****");
		Employee e4 = new Employee("user3",3);
		
		Project p4 = new Project(1555,"pro555");
		map.put(e4, p4);
		//interview: p3 is replaced with p4
		//e3 and e4 are same . so we replaced e3 with e4
		//as hasmap's key has to be unique
		System.out.println("**** print map  ****");
		printMap(map);
		System.out.println(map.get(e1));
		System.out.println(map.get(e2));
		System.out.println(map.get(e3));
		
		
		System.out.println("get e5");
		Employee e5 = new Employee("user2",2);
		System.out.println(map.get(e5));
		//interview: c2 and e5 are duplicates, even if we did not add e5 to the map, we would still
		//get the value for e5
		
		*/
		Employee e5 = new Employee("user2",2);
		System.out.println(" ****contains e5*****");
		System.out.println(map.containsKey(e5));
		// interview: return true as e2 and e5 are duplicates
		
		System.out.println("*****get e2******");
		System.out.println(map.get(e2));
		
		System.out.println(" ****remove  e5*****");
		map.remove(e5);
		//can remove and it would remove e2 as e2 and e5 are duplicates
		System.out.println("*****get e2******");
		System.out.println(map.get(e2));
	}

	private static void printMap(Map<Employee, Project> map) {
		for(Entry<Employee, Project> entry :  map.entrySet()) {
			Employee e = entry.getKey();
			Project p = entry.getValue();
			
			System.out.println("key= "+e + " , value=" + p);
		}
	}

}
