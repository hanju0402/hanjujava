
public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("원본");
		sb.append(", One=")
		.append(1+3)
		.append(",DoubleValue=")
		.append(255.0);
		
//		StringBuffer sbuffer;  
		
//		sb.replace(start, end, str);
		sb.insert(0, "시작");
		sb.insert(4, "뀨");
//		sb.setCharAt(0, 'Q'); // 몇번쨰 글자를 바꾼다
		
		
		String result = sb.toString();
		System.out.println(result);
		
	}

}
