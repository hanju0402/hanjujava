import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			int left = 10;
			int right = 1;
//			int a = scan.nextInt();
//			
//			if (a.instenceOf)
			if (right == 0) {
				// 0으로 나눌려고 함(예외적인 상황)
				// 보고서 적어서 던질거임.
				throw new MyzeroDivideException("0으로");
		//		throw new Exception("0으로 나누는 예외적인 상황이 발생했습니다~~~");
			}
			
			if (left == 10) {
				throw new Exception("left가 10입니다.");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
