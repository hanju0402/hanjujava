import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main9 {
	public static boolean isNumberChar(char c) {
		return c >= '0' && c <= '9';
	}

	public static boolean isNumberStr(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!isNumberChar(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "carrot", "donut", "egg"));
		List<String> list2 = new ArrayList<>(Arrays.asList("apple", "banana", "carrot", "donut", "egg"));
		// 위의 리스트에서
		// 문자열 길이가 5글자인 문자열만을 원소로 가지는 리스트 생성

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.length() != 5) {
				iterator.remove();
			}
		}

		System.out.println(list);

		// 문자열 중에'e'문자를 포함하는 문자열만을원소로 가지는 리스트 생성
		Iterator<String> iterator2 = list2.iterator();
		while (iterator2.hasNext()) {
			String str = iterator2.next();
			if (!str.contains("e")) {
				iterator2.remove();
			}
		}
		System.out.println(list2);

		List<String> list3 = new ArrayList<>(Arrays.asList("가", "1", "@", "3", "나"));

		// 위의 2번 리스트에서 ' 정수 형태의 값' 을 가지는 문자열을 찾아
		// 해당 원소를 가지는 정수형 리스트 생성

		// '정수 형태의 값'을 가지는 문자열을 -> Interger 형으로
		// Integer i = Integer.valueOf("1234"); // => Integer 반환
		// Integer exp = Integer.valueOf("숫자아니면?"); // => NumberFormatException 예외 발생
		List<Integer> listInteger = new ArrayList<>();
		for (int j = 0; j < list3.size(); j++) {
			String str = list3.get(j);

			if (isNumberStr(str)) {
				listInteger.add(Integer.valueOf(str));
			}

//			try {
//				Integer itg = Integer.valueOf(str);
//				listInteger.add(itg);
//					
//			} catch (NumberFormatException e) {
//				//System.out.println("문자열을 정수형으로 변환하는데 실패하여 예외가 발생했으나 정상흐름으로 돌아가기를 원해 예외처리를 하였습니다.");
//			}

//			for (int i = 0; j < list3.size() && isNumber == true; i++) {
//				System.out.println(list3.get(i));
//			}
		}
		System.out.println(listInteger);

	}

}
