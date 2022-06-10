import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
//		System.out.println(Long.MAX_VALUE);
		
//		BigInteger value1 = new BigInteger("9223372036854775808");
//		System.out.println(value1.add(new BigInteger("10")));
//		// value1 자체의 값은 바뀌지 않음
//		System.out.println(value1); 
		
		BigDecimal dec = new BigDecimal("0.123456789");
		System.out.println(dec);
		
		BigDecimal d = new BigDecimal(0.1);
		System.out.println(d);
	}

}
