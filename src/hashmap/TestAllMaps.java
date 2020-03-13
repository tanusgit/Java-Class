package hashmap;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestAllMaps {
	public static void main(String[] args) {
		System.out.println("************** HASHMAP ********************");
		
		Map<String, String> map = new HashMap<>();
		map.put("129", "user2");
		map.put("132", "user6");
		map.put("128", "user1");
		map.put("133", "user7");
		map.put("130", "user3");
		map.put("131", "user4");

		showMap(map);
		
		System.out.println("************** LINKEDMAP ********************");
		map = new LinkedHashMap<>();
		map.put("129", "user2");
		map.put("132", "user6");
		map.put("128", "user1");
		map.put("133", "user7");
		map.put("130", "user3");
		map.put("131", "user4");
		showMap(map);
		
		
		System.out.println("************** TREEMAP ********************");
		map = new TreeMap<>();
		map.put("129", "user2");
		map.put("132", "user6");
		map.put("128", "user1");
		map.put("133", "user7");
		map.put("130", "user3");
		map.put("131", "user4");
		showMap(map);
	}

	private static void showMap(Map<String, String> map) {
		// show all elements in map
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key === " + key + "  value ==" + value);
		}
	}
/*
 
 */
}
