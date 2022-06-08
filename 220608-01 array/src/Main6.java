public class Main6 {
	public static void someMethod(int... arr) {
		for (int number : arr) {
			System.out.println(number);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		
		int[] arr = { 10, 20, 30, 40, 50 };
		
//		someMethod(arr);
		someMethod(new int[] {20, 30, 40, 50, 60 });
		System.out.println("---");
		someMethod(new int[] {4, 5, 6});
		System.out.println("종료");
//		for (int number : arr) {
//		
//			// for 에 : (콜론)이 들어가면 오른쪽엔 배열 객체하나
//			// 반복할때마다 첫번째 배열부터 하나씩 끄집어 낸다.
//			// : 콜론 왼쪽엔 사용할 타입과 변수를 선언
//			System.out.println(number);
//		}
	}
}
