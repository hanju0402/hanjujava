import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		// 원소 하나하나를 볼수있게 도와주는 객체 선언
		Iterator<String> iterator = list.iterator();
		//다음원소가 있으면 true 없으면 false
		// index의 제약이 없음 다음 자료가 있는지만 확인하기 떄문
		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.length() == 5) {
				iterator.remove();
			}
		}
		System.out.println(list);
		

		
		
		
		
		
		
		
		
		
		// 이퀄스로 존재하는지 트루 폴스값으로 알려줌 contains
//		System.out.println(list.contains(new String("banana")));
//		list.remove("banana");
//		
//		System.out.println(list);
		
		// 위의 리스트에서 5글자 문자열만 찾아서 지우기
//		for (String s : list) {
//			if (s.length() == 5) {
//				list.remove(s);
//			}
//		}
//		System.out.println(list);
		
		

	}

}
