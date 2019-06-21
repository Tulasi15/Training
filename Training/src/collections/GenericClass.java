package collections;


	public class GenericClass<T> {
		T obj;
		GenericClass(T obj) {
			this.obj = obj;
		}
		public T print() {
			return this.obj;
		}
		public static void main(String[] args) {
			GenericClass<Integer> objI = new GenericClass<Integer>(10);
			System.out.println("this is integer value "+objI.print());
			
			GenericClass<String> objS = new GenericClass<String>("this is vinay");
			System.out.println("this is string value "+objS.print());
		}
	}


