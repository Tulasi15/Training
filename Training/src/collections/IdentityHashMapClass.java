package collections;


	import java.util.HashMap;
	import java.util.IdentityHashMap;

	public class IdentityHashMapClass {
	 public static void main(String []args) {
		 HashMap<Integer, String> hm = new HashMap<>();
		 Integer i1 = new Integer(130);
		 Integer i2 = new Integer(130);
		 
		 hm.put(i1, "Krishna");
		 hm.put(i2, "Kumar");
		 
		 System.out.println(hm);
		 
		 IdentityHashMap<Integer, String> ihm = new IdentityHashMap<>();
		 ihm.put(i1, "Krishna");
		 ihm.put(i2, "Kumar");
		 System.out.println(ihm);
		 
	 }
	}

