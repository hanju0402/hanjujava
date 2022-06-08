import java.util.Scanner;

public class Reservation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[10];
		boolean inOut = true;
		boolean inOut2 = true;
		while (inOut == true) {
			inOut2 = true;
			System.out.println("좌석을 예약하시겠습니까? (네 or 아니오)");
			String input = scan.next();
			
			if (input.equals("네")) {
				
				while (inOut2 == true) {
					System.out.println("-------------------------");
					System.out.println("1 2 3 4 5 6 7 8 9 10");
					System.out.println("-------------------------");
					for (int i = 0; i < 10; i++) {
						System.out.print(num[i] + " ");						
					}
					System.out.println();
					System.out.print("몇번째 좌석을 예약하시겠습니까? ");
					int input2 = scan.nextInt();
					
					if (num[input2-1] < 1) {
						num[input2-1]++; 
						inOut2 = false;
					} else { 
						System.out.println("이미 예약된 좌석입니다.");
					}
				}
				System.out.println("예약되었습니다.");
			} else if (input.equals("아니오")) {
				System.out.println("프로그램을 종료합니다.");
				inOut = false;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
