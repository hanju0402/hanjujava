import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) {
		String longLine = "apple banana carrot, donut banana";
		
		StringTokenizer st = new StringTokenizer(longLine, " ");
		int i = 0;
		while (st.hasMoreTokens()) {
			
			if (st.nextToken().equals("banana")) {
				i++;
			}
			
		}
		System.out.println("바나나는 " + i + "개 있습니다." );
		System.out.println(st.hasMoreTokens());
		
		
		
//		System.out.println(longLine.substring(0, 5));
//		System.out.println(longLine.substring(6, 12));
//		System.out.println(longLine.substring(13, 19));
//		System.out.println(longLine.substring(20));
	}

}
