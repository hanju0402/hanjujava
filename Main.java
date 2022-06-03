import java.time.LocalDate;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {	
//		// java.util.Calendar
//		Calendar today = Calendar.getInstance();
//		
//		System.out.println(today.get(Calendar.YEAR));
//		System.out.println(today.get(Calendar.MONTH) + 1);
//		//1월을 0으로 만들어놔서 월에는 +1을 해줘야지 해당월이 나온다.
//		System.out.println(today.get(Calendar.DAY_OF_MONTH));
//		// 1은 년,  2 는 월,  5는 일 Calendar 유틸에 정해저있음
//		// 1.8 ~ java.time.LocalDate
//		System.out.println(today.get(Calendar.DAY_OF_WEEK));
//		// 일요일부터 1 ~ 7 로 편성
		
		LocalDate today = LocalDate.now();
		System.out.println(today.getYear());
		
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		
		System.out.println(today.getDayOfMonth());
		
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfWeek().getValue());
	}
}

