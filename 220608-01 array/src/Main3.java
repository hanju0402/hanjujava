import java.util.Arrays;

public class Main3 {
	// 정수형 배열을 전달받아 같은 길이와 원소값을 가지는 정수 배열을 반환하는 메소드
	public static int[] copyArray(int[] origin) {
		int[] copy = new int[origin.length]; 
		
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		return copy;
	}
	
	public static boolean same(int[] a, int[] b) {
		int count = 0;
		for (int i = 0; i < a.length && i < b.length; i++) {
			if (a[i] != b[i]) {
				count++;
			}
		}
		
		if (count == 0 && a.length == b.length) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	// 정수형 배열 2개가 동일한지(길이와 각 원소값)를 알 수 있는 메소드
	
	public static void main(String[] args) {
		int[] test = { 50, 70, 90, 100 };
		int[] test2 = { 50, 70, 90, 150 }; 
		int[] c = copyArray(test);
		System.out.println(Arrays.toString(c)); // String으로 반환
		System.out.println(same(test, test2));
	}

}
