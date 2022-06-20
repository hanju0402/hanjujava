import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main7 {
	public static void main(String[] args) {
		// 2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
		
		// 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
		
		// 3번. 위의 리스트의 원소들을 모두 다 가지는 리스트
		
		// 3번의 리스트를 오름차순으로 정렬된 원소를 가지는 리스트
		
		//--
		// (Random 객체를 사용하여) 0 ~ 10사이의 난수를 6개 가지는 리스트 (각 숫자값은 중복되지 않아야 함)
		
		//2의 배수
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		ArrayList<Integer> list4 = new ArrayList<>();
		ArrayList<Integer> list5 = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			list1.add(2*i);
		}
		System.out.println(list1);
		
		//7의 배수
		for (int i = 1; i <= 5; i++) {
			list2.add(7*i);
		}
		System.out.println(list2);
		
		// 둘다 가지는 리스트
		list3.addAll(list1);
		list3.addAll(list2);
		
		
		System.out.println(list3);
		
		
		
		//3번 오름차순
		Collections.sort(list3);
		System.out.println(list3);
		
		
		//랜덤 중복없는 6개 난수
		Random random = new Random();
		
//		for (int i = 0; i < 6; i++) {
//			list4.add(i);
//			list4.set(i, random.nextInt(11));
//			for (int j = 0; j < i; j++) {
//				if (list4.get(i) == list4.get(j)) {
//					i--;
//				}
//			}
//		}
////		System.out.println(list4);
//		
//		for (int i = 0; i <6; i++) {
//			
//			list5.add(list4.get(i));
//		}
//		
//		System.out.println(list5);
		
		while (list5.size() < 6) {
			int result = random.nextInt(11);
			if (!list5.contains(result)) {
				list5.add(result);
			}
		}
		System.out.println(list5);
	
		
		
		
		
		
		
		
		
		

	}

}
