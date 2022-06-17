import java.util.StringJoiner;

public class Main2 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",", "[", "]"); // 사이사이에 설정한 문자를 넣는다
		sj.add("1");                      //( 사이에 넣을문자, 시작에 넣을문자, 마지막에 넣을문자)
		sj.add("2");
		sj.add("3");
		
		
		
		//String result = sj.toString();
		
		System.out.println(sj.toString());
		
		

	}

}
