import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Animal[] ani = new Animal[50];
		ani[0] = new Animal("사자", "육식", 7, 97);
		ani[1] = new Animal("호랑이", "육식", 6, 105);
		ani[2] = new Animal("기린", "초식", 10, 130);
		ani[3] = new Animal("독수리", "육식", 4, 57);
		ani[4] = new Animal("코뿔소", "초식", 2, 80);
		ani[5] = new Animal("소", "초식", 3, 92);

		Staff[] stf = new Staff[50];
		stf[0] = new Staff("조련사", "마이콜");
		stf[1] = new Staff("경영", "또치");
		stf[2] = new Staff("인사", "둘리");
		stf[3] = new Staff("조련사", "도우너");

		boolean inOut = true;

		while (inOut == true) {
			boolean inOut2 = true;
			System.out.println("-동물원관리 프로그램-");
			System.out.println("1.동물 목록   2. 직원 목록  3. 동물 추가  4. 종료");
			int input = scan.nextInt();

			if (input == 1) {
				System.out.println("1.전체동물   2.육식동물   3.초식동물");
				int input2 = scan.nextInt();

				if (input2 == 1) {
					for (int i = 0; i < ani.length && inOut2 == true; i++) {

						System.out.println(
								"[" + (i + 1) + "]    " + "이름: " + ani[i].getName() + "  타입: " + ani[i].getFeedType()
										+ "  나이: " + ani[i].getAge() + "살" + "  몸무게: " + ani[i].getWeight() + "kg");
						if (ani[i + 1] == null) {
							inOut2 = false;
						}
					}
				} else if (input2 == 2) {
					for (int i = 0; i < ani.length && inOut2 == true; i++) {
						if (ani[i].getFeedType().equals("육식")) {
							System.out.println("[" + (i + 1) + "]    " + "이름: " + ani[i].getName() + "  타입: "
									+ ani[i].getFeedType() + "  나이: " + ani[i].getAge() + "살" + "  몸무게: "
									+ ani[i].getWeight() + "kg");
						}

						if (ani[i + 1] == null) {
							inOut2 = false;
						}
					}
				} else if (input2 == 3) {
					for (int i = 0; i < ani.length && inOut2 == true; i++) {
						if (ani[i].getFeedType().equals("초식")) {
							System.out.println("[" + (i + 1) + "]    " + "이름: " + ani[i].getName() + "  타입: "
									+ ani[i].getFeedType() + "  나이: " + ani[i].getAge() + "살" + "  몸무게: "
									+ ani[i].getWeight() + "kg");
						}

						if (ani[i + 1] == null) {
							inOut2 = false;
						}
					}
				}
			} else if (input == 2) {
				for (int i = 0; i < ani.length && inOut2 == true; i++) {
					System.out
							.println("[" + (i + 1) + "]    " + "담당: " + stf[i].getRole() + "  이름: " + stf[i].getName());

					if (stf[i + 1] == null) {
						inOut2 = false;
					}
				}
			}

		}

	}

}
