import java.util.Arrays;

public class Main5 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
//		int[] temp = { 40, 50, 60 };
//		int[] copy = Arrays.copyOf(arr, 2);//(복사할대상, 설정할렝스수치)
//		int[] arr2 = arr;
		Arrays.fill(arr, 100);
		
		System.out.println(Arrays.toString(arr));
		
		
		
//		int[] another = Arrays.copyOfRange(temp, 2, temp.length);
//		System.out.println(Arrays.toString(another));
//		System.out.println(Arrays.toString(copy));
//		System.out.println(Arrays.equals(arr, copy));
//		// 두열이 같은지 다른지 알려주는 유틸
//		System.out.println(Arrays.equals(arr, arr2));
		
		
		

	}

}
