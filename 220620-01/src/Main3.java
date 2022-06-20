import java.util.ArrayList;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		// 위의 리스트에 10, 20, 30, 40
		
		// 모든 원소들을 출력해 보세요
		
		
		
		for (int i = 1; i <= 4; i++) {
			list.add(i * 10);
		}
		System.out.println(list);
		list.set(1, 15);
		System.out.println(list);
		
		System.out.println(list.contains(20));
		System.out.println(list.indexOf(30));
		//리스트 배열 제거할때
		list.remove(1);
		System.out.println(list);
		// 리스트 배열 추가할때
		// 0번쨰 배열을 밀어내고 0번째 자리를 차지함
		// 원래 인덱스0번째 데이터는 인덱스1번으로 밀려남
		list.add(0, 0);
		System.out.println(list);
		
		// 모든 자료를 다 날려버림 
		list.clear();
		System.out.println(list);
		
		// for문으로 하나씩 remove로 지우면 하나 지울때마다 인덱스가 하나씩 땡겨져서
		// 다 지워지지가 않음
		System.out.println(list.size() == 0);
		System.out.println(list.isEmpty());
	

	}

}
