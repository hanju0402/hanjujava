import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main8 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
		// 합, 평균
		
		// 정수 57이 리스트에 있는지? 있으면 몇 번째 index에 위치하는지?
		
		// 
		int sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i); 
		}
		
		System.out.println(sum);
		
		int avg = sum / list.size();
		
		System.out.println(avg);
		
		//57
		
		System.out.println(list.contains(57));
		System.out.println(list.indexOf(57));
		
		
		//정수 23의 개수

		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 23) {
				count ++;
			}
		}
		System.out.println(count);
	
		// 23 중복 하나 삭제
		
		
//		Iterator<Integer> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			int value = iterator.next();
//			if (value == 23) {
//				iterator.remove();
//				
//			}
//			
//		}
//		System.out.println(list);
		
//		int index = list.indexOf(23);
//		list.remove(index);
//		System.out.println(list);
		
		list.remove(Integer.valueOf(23));
		System.out.println(list);
			
		
		
		
	}
}
