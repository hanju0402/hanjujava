
public class Main2 {

	public static void main(String[] args) {
		String s = null;
		try {
			String local = "지역변수";
			
//			int[] arr = new int[0];
//			arr[1] = 10;
			
			int div = 10 / 0;
			
			s.equals("asdf");

			System.out.println("실행되냐??");
		} catch (NullPointerException e) {

			System.out.println("널 포인트 익셉션 처리");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 에외 처리");
		} catch (Exception e) {
			System.out.println("모든 예외는 여기서 잡힙니다.");
		}
		System.out.println("정상 종료");
	}
}
