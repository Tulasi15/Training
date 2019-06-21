package collections;

import java.util.HashMap;

public class HashMapWithoutGenerics {
 public static void main(String args[]) {
	 HashMap hm = new HashMap<>();
		hm.put("a", "apple");
		hm.put("b", "ball");
		hm.put("c", "cat");
		hm.put("d", "dog");
		hm.put("a", "allow"); //replacing old value with new value
		hm.put("null", "dog");
		hm.put("null", "test");
		System.out.println(hm);
 }
}

