// 사용자에게 5번의 정수를 입력받아
// 최근 입력한 순(역순)으로 출력하기

// 예) 10 20 30 40 50 -> 50 40 30 20 10


// 사용자가 0이하의 정수를 입력할 때까지 반복하여 입력
// 최근 5개를 출력

// 10 20 30 40 50 60 70 80 90 100 -1 -> 100 90 80 70 60
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int[] a = new int[5];
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.println("정수를 입력하세요: ");
//			int input = scan.nextInt();
//			
//			a[i] = input;
//		}
//		
//		for (int i = 4; i >= 0; i--) {
//			System.out.println(a[i]);
//		}
		
		
		//for (int i = 0; i < 0)
		
		boolean inOut = false;
		while (inOut == false) {
			int size = 0;
			int[] b = new int[size];
			System.out.println("정수를 입력하세요: ");
			int input = scan.nextInt();
		if (input > 0) {
			b[size] = input;
			size++; 
		} else {
			inOut = true;
		}
		
		} 
		
//		for (int i = size; i < size-5; i--) {
//			System.out.println(b[i]);
//		}
		
		
			
			
		
		
		
		
		
		
		//int[] b = new int[size];
		
		

	}

}
