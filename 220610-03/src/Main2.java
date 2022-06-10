import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		// 2 ~ 5의 제곱수들을 각 원소로 가지는 2차원 배열 선언 초기화 후에 모든 원소 출력해보기
		// 2 4 8 16 ....
		// 3 9 27 81 ...
		// 4 16 64 256 ....
		// 5 25 125 625....
		
		
		int[] squa1 = {2,4,8,16,32};
		int[] squa2 = {3,9,27,81,243};
		int[] squa3 = {4,16,64,256,1024};
		int[] squa4 = {5,25,125,625,3125};
		
		
		int[][] squared = new int[4][5];
		
		
		squared[0] = squa1;
		squared[1] = squa2;
		squared[2] = squa3;
		squared[3] = squa4;
		 
		
		for (int i = 0; i < squared.length; i++) {
			int n = 1;
			for (int j = 0; j < squared[i].length; j++) {
				n *= 2 + i;
				squared[i][j] = n;
				
			}
			
		}
		System.out.println(Arrays.deepToString(squared));
		
     
	}

}
