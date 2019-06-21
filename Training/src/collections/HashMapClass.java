package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapClass {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("a", "apple");
		hm.put("b", "ball");
		hm.put("c", "cat");
		hm.put("d", "dog");
		hm.put("a", "allow"); //replacing old value with new value
		hm.put("null", "dog");
		hm.put("null", "test");
		
		Set<String> keys = hm.keySet();
		for (String key : keys) {
			String value = hm.get(key);
			System.out.println(key +" " +value);
		}
		
		Set<Entry<String, String>> set = hm.entrySet();
		for (Entry<String, String> entry : set) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+" "+val);
		}
		
		/*HashMap<Employee, Employee> hm1 = new HashMap<>();
		Employee employee = new Employee();
		hm1.put(employee, employee);*/
		
		
	}

}
