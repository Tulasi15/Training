package collections;
import java.util.ArrayList;

	

	public class Generics {

		public static void main(String[] args) {

			ArrayList al = new ArrayList();
			al.add("vinay");
			al.add("kumar");
//			al.add(10);
//			al.add(10.5);
			for (Object object : al) {
				String s = (String) object; // down casting
				System.out.println(s);
			}
			/*for (Object object : al) {
				if(object instanceof String) {
					String s = (String)object;
					System.out.println("this is String value " +s);				
				} else if(object instanceof Integer) {
					Integer i = (Integer)object;
					System.out.println("this is Integer value " +i);
				} else {
					System.out.println("this is "+object.getClass().getSimpleName()+" value " +object);	
				}
				
			}*/
			
			ArrayList<String> al2 =  new ArrayList<>();
			al2.add("this");
			al2.add("is");
			al2.add("vinay");
			for (String s : al2) {
				System.out.println(s);
			}
		}
}
