package collections;

public class GenericFunctions {
	static <T> void display(T element) {
		System.out.println(element.getClass().getName() +" "+ element);
	}
	
	static <A> void print(A[] elements) {
		for (A e : elements) {
			System.out.println(e);
		}
	}
	
	public static void main(String []args) {
		display(10);
		display("this is vinay");
		
		Integer[] array = {10,20,30,40};
		Character cArray[]= {'J','A','V','A'};
		print(array);
		print(cArray);
		
	}
	
}
