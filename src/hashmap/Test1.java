package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test1 {

		public static void main(String[] args) {
			Map<String, String> map = new HashMap<>();
			map.put("128", "user1");
			map.put("129", "user2");
			map.put("130", "user3");
			map.put("131", "user4");
			map.put("132", "user6");
			map.put("133", "user7");

			// get the size
			System.out.println(map.size());// 6
			

			map.put("128", "user111"); // replace "user1" with "user111"
			map.put("131", "user44"); // replace "user4" with "user44"

			// get the size
			System.out.println(map.size());// 6

			System.out.println(map.get("128")); // "user111"

			System.out.println(map.containsKey("132")); // returns true
			System.out.println(map.containsKey("500")); // returns false
			
			// show all elements in map
			for (Entry<String, String> entry : map.entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue();
				System.out.println("key === " + key + "  value ==" + value);
			}
			
			System.out.println("deleting elements");
			map.remove("128");
			System.out.println(map.size());
			
			
			for (Entry<String, String> entry : map.entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue();
				System.out.println("key === " + key + "  value ==" + value);
			}
			
			
			
			
		}
	}


