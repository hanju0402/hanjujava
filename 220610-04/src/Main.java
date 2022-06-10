
public class Main {
	public static void someMethod(int patam) {
		
		
	}
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void sum(double a, double b) {
		System.out.println(a + b);
	}
	
	public static void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public static void main(String[] args) {
//		simeMethod(3873.03736);
//		simeMethod("asdf");
		
		
		// Method Overloading
//		System.out.println(12313);
//		System.out.println(123.13);
//		System.out.println("123.13");
		sum(10.0, 40.0);
		sum(10, 40);
		sum(10, 40, 50);

	}

}
