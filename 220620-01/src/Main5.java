import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		// Arryas로 만든 리스트는 원소 추가, 삭제, 변경 불가능
		List<Integer> list = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println(list);
		
		
//		List<Integer> test = Arrays.asList(10, 20, 30, 40, 50);
//		test.add(60);
		
		list.addAll(Arrays.asList(60, 70, 80));
		System.out.println(list);
		
		list.removeAll(Arrays.asList(30, 40, 50));
		System.out.println(list);
		
		System.out.println(list.containsAll(Arrays.asList(10, 20, 30)));
		
		List<Integer> sub = list.subList(0, 3);
		System.out.println(sub);
		System.out.println(list);
	}
}
