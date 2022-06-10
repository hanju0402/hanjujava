
public class Main {

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8, 10 };
		int[] arr2 = { 3, 6, 9, 12, 15 };
		int[] arr3 = { 4, 8, 12, 16, 20 };
		
		int[][] arr2d = new int[3][5]; //arr2d 는 5칸짜리 배열 3줄을 갖는다
		arr2d[0] = arr1; // 1번째줄
		arr2d[1] = arr2; // 2번째줄
		arr2d[2] = arr3; // 3번째줄
		
		for (int j = 0; j <arr2d.length; j++) {
			//2차 배열 렝스는 앞에 줄수를 의미한다.
			for (int i = 0; i < arr2d[j].length; i++) 
			System.out.println(arr2d[j][i]);
		}
		
		
		
		
		
		
//		int[][] arrAnother = { { 2, 4, 6 }, { 3, 6, 9 }, { 4, 8, 12} };
//		for (int i = 0; i < arrAnother[0].length; i++) {
//			System.out.println(arrAnother[1][i]);
//		}

		

	}

}
