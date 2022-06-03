import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class TestDateMethods {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		today.add(Calendar.DAY_OF_MONTH, 1);
		
		Date date = today.getTime();
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		String tomorrow = simple.format(date);
		System.out.println(tomorrow);
		
		
		
		
		// 내일의 날짜 객체
//		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
//		Date dt = new Date();
//		Calendar c = Calendar.getInstance();
//		c.setTime(dt);
//		
//		c.add(Calendar.DATE, -10289);
//		//             뭘 늘릴껀지, 얼마나 늘릴껀지 
//		Date tomorrow = c.getTime();
//		
//		System.out.println(simple.format(tomorrow));
		
	}

}
