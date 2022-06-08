import java.util.Arrays;

public class Main4 {
	// 두 개 정수 배열을 전달받아 결합시켜 반환하는 메소드
	// 예) [1, 2, 3] [10, 11, 12, 13, 14]
	// [1, 2, 3, 10, 11, 12, 13, 14]
	
	
	
	// 두 개 정수 배열의 합을 가지는 배열을 반환하는 메소드
	// 예 [1, 2, 3] [10, 11, 12, 13, 14]
	// [11, 13, 15, 13, 15]
	
	
	public static int[] add (int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i]; 
		}
		for (int i = a.length; i < c.length; i++ ) {
			c[i] = b[i-a.length];
		}
		return c;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] add1 = {15, 22};
		int[] add2 = {20, 30, 50, 51, 33, 90};
		
		
		System.out.println(Arrays.toString(add(add1, add2)));
		
//		int[] arr = { 10, 20, 30 };
//		
//		int[] larger = new int[arr.length + 2];
//		for (int i = 0; i < arr.length; i++) {
//			larger[i] = arr[i];
//		}
//		
//		System.out.println(Arrays.toString(larger));
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		

	}

}
