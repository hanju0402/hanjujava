import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 1));
		
		//오름차순
		Collections.sort(list);
		System.out.println(list);
		
		// 인덱스를 알려주는 코드
		int index = Collections.binarySearch(list, 8);
		System.out.println("8의 인덱스: " + index);
		
		//내림차순 (오름차순 정렬후 리버스)
		Collections.reverse(list);
		System.out.println(list);
		
		//셔플( 랜덤으로 섞는다)
		Collections.shuffle(list);
		System.out.println(list);
		
		//최댓값 최솟값
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		// 길이는 유지하면서 배열안의 원소값을 설정값으로 모두 바꾼다(채운다)
		Collections.fill(list, 33);
		System.out.println(list);
		
		//선택적으로 바꾼다 ex) 33 인 숫자만 77로 바꿔라
		Collections.replaceAll(list, 33, 77);
		System.out.println(list);
		
//		list.clear();
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70));
		// 리스트 배열에 타겟배열을 복사해서 넣는다 복사할 칸수가 존재해야 덮어쓰기 가능
		Collections.copy(list, target);
		
		System.out.println(list);
		
	}
}
