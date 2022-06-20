import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("사과", "포도", "오렌지", "배", "수박", "멜론"));

		Scanner scan = new Scanner(System.in);
		// 콘솔 입출력
		boolean out = false;

		while (!out) {
			boolean out2 = false;
			System.out.println("1.과일목록  2.과일주기  3.과일추가");
			int selected = scan.nextInt();
			if (selected == 1) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + ". " + list.get(i));
				}
			} else if (selected == 2) {
				System.out.println("고객에게 과일을 주시겠습니까?  1. yes 2. no");
				int selected2 = scan.nextInt();

				if (selected2 == 1) {
					if (list.size() == 0) {
						System.out.println("과일이 없습니다.");
					} else if (list.size() >= 1) {
						list.remove(0);
						System.out.println("과일을 줬습니다.");
					} 
					
				} else {
					System.out.println("다시 돌아갑니다.");
				}
			} else if (selected == 3 && out2 == false) {
				System.out.println("과일을 추가 하시겠습니까?  1. yes 2. no");
				int selected3 = scan.nextInt();

				if (selected3 == 1) {
					if (list.size() >= 10) {
						System.out.println("등록할수 있는 과일이 꽉찼습니다.");
						out2 = true;
					} else {
						System.out.println("추가하실 과일 이름을 입력하세요.");
						String fruitName = scan.next();
						list.add(list.size(), fruitName);
					}
				} else {
					System.out.println("다시 돌아갑니다.");
				}
			}

		}

		// 과일 목록 보여주기
		// 고객에게 과일 주기(제일 앞에거부터 줌)
		// 재고 과일 추가하기(제일 마지막에 추가) - 진열대가 최대 10개
	}

}
