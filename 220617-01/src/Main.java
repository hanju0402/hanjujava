import java.util.InputMismatchException;
import java.util.Scanner;

//정수 2개 입력받아서 나누기한 몫을 출력하는 프로그램
public class Main {

	public static void main(String[] args) {
		System.out.println("프로그램시작");
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("왼쪽 수 입력?");
			int left = scan.nextInt();
			System.out.println("오른쪽 수 입력?");
			int right = scan.nextInt();

			
				System.out.println("나눈 몫: " + (left / right));
			// 오류 코드 입력
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해야합니다.");
//			System.out.println(e.getMessage()); 
//			e.printStackTrace(); // 예외가 발생됐던 경로를 콘솔창에 출력해라
		} catch (ArithmeticException a) {
			System.out.println("0으로 나눌수 없습니다.");
		}

		System.out.println("프로그램 정상 종료");
// 원하는 타입을 입력안했을때 타입 오류를 캐치해서 정상흐름으로 진입하게 해줌
		// for 문 Scanner 문에서 input 영역에 인풋대신 이퀄스를 썼었는데
		// 그렇게 할 필요가 없음
	}

}
