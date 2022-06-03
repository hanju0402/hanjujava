
import java.util.Scanner;

public class mainTest {

	public static void main(String[] args) {
		
		int year;
		int month;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요: ");
		year = scan.nextInt();
		System.out.println("월을 입력하세요: ");
		month = scan.nextInt();
		
		try {
			//입력받은 year와 month를 매개변수로 객체 및 데이터 생성
			CalendarPrint cal = new CalendarPrint(year, month);
			// systme.out 콘솔에 출력
			cal.printCal();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
