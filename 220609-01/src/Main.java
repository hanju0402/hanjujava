/*
*
* 도서 관리 프로그램
*
* 
* 1. 도서입력
* 2. 목록 보기(가격순으로)
* 3. 목록보기(장르를 선택해서 해당 장르만)
* 4. 도서 정보 수정
* 5. 도서 정보 추가
*/

// 1. 작별인사 / 김영하 / 복복서가 / 장편소설 / 12,600원
// 2.  불편한 편의점 / 김호연 / 나무옆의자 / 장편소설 / 12,600원
// 3. 지금 알고 있는 걸 그때도 알았더라면 / 류시화 / 열림원 / 시집 / 8,100원
// 4. 코스모스 / 칼 세이건 / 사이언스북스 / 과학 공학 / 16,650원
// 5. 여행의 이유 / 김영하 / 문학동네 / 에세이 / 12,150원
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = 5;
		Booklist bookBase0 = new Booklist("작별인사", "김영하", "복복서가", "장편소설", 12600);
		Booklist bookBase1 = new Booklist("불편한 편의점", "김호연", "나무옆의자", "장편소설", 12600);
		Booklist bookBase2 = new Booklist("지금 알고 있는 걸 그때도 알았더라면", "류시화", "열림원", "시집", 8100);
		Booklist bookBase3 = new Booklist("코스모스", "칼 세이건", "사이언스북스", "과학 공학", 16650);
		Booklist bookBase4 = new Booklist("여행의 이유", "김영하", "문학동네", "에세이", 12150);
		

		boolean inOut = false;

		while (inOut == false) {
			Booklist[] book = new Booklist[p];
			book[0] = bookBase0;
			book[1] = bookBase1;
			book[2] = bookBase2;
			book[3] = bookBase3;
			book[4] = bookBase4;

			System.out.println(" -- 도서 관리 프로그램 -- ");
			System.out.println("1. 도서목록  2.상세보기  3.도서 정보 수정  4.도서 정보 추가");
			String input1 = scan.next();

			if (input1.equals("1")) {
				System.out.println("1.가격순  2.분야별");
				String input2 = scan.next();
				if (input2.equals("1")) {

					System.out.println("1.높은순  2.낮은순");
					String input3 = scan.next();

					if (input3.equals("1")) {
						for (int i = 0; i < book.length; i++) {
							for (int j = i + 1; j < book.length; j++) {
								if (book[i].getPrice() < book[j].getPrice()) {
									Booklist ch = book[i];
									book[i] = book[j];
									book[j] = ch;
								}
							}
						}
					} else if (input3.equals("2")) {
						for (int i = 0; i < book.length; i++) {
							for (int j = i + 1; j < book.length; j++) {
								if (book[i].getPrice() > book[j].getPrice()) {
									Booklist ch = book[i];
									book[i] = book[j];
									book[j] = ch;
								}
							}
						}
					}
					for (int i = 0; i < book.length; i++) {
						System.out.println(book[i].getName() + "[" + book[i].getPrice() + "원]");
					}

				} else if (input2.equals("2")) {

					for (int i = 0; i < book.length; i++) {
						if (book[i].getType().equals("장편소설")) {

							System.out.println(book[i].getName() + "(장편소설)  ");
						} else if (book[i].getType().equals("시집")) {
							System.out.println();
							System.out.println(book[i].getName() + "(시집)  ");
						} else if (book[i].getType().equals("과학 공학")) {
							System.out.println();
							System.out.println(book[i].getName() + "(과학 공학)  ");
						} else if (book[i].getType().equals("에세이")) {
							System.out.println();
							System.out.println(book[i].getName() + "(에세이)  ");
						} else {
							System.out.println("등록되지않은 종류입니다.");
						}
					}

				}

			} else if (input1.equals("2")) {
				for (int i = 0; i < book.length; i++) {
					System.out.println(i + 1 + ". " + book[i].getName());
				}

				int input4 = scan.nextInt();
				for (int i = 0; i < book.length; i++) {
					if (input4 == i + 1) {
						System.out.println("책 제목: " + book[input4 - 1].getName() + "\n저자: "
								+ book[input4 - 1].getAuthor() + "\n출판사: " + book[input4 - 1].getPublisher()
								+ "\n책 유형: " + book[input4 - 1].getType() + "\n가격: " + book[input4 - 1].getPrice());
					}
				}

			} else if (input1.equals("3")) {
				System.out.println("수정할 책을 선택하세요.");
				for (int i = 0; i < book.length; i++) {
					System.out.println(i + 1 + ". " + book[i].getName());
				}
				int input5 = scan.nextInt();
				System.out.println("변경하실 정보를 선택하세요.");
				for (int i = 0; i < book.length; i++) {
					if (input5 == i + 1) {
						System.out.println(
								"1. 책 제목: " + book[input5 - 1].getName() + "\n2. 저자: " + book[input5 - 1].getAuthor()
										+ "\n3. 출판사: " + book[input5 - 1].getPublisher() + "\n4. 책 유형: "
										+ book[input5 - 1].getType() + "\n5. 가격: " + book[input5 - 1].getPrice());
					}
				}
				int input6 = scan.nextInt();
				if (input6 == 1) {
					System.out.println("선택된 책 제목: " + book[input5 - 1].getName());
					System.out.print("변경하실 책 제목: ");
					String Tch = scan.next();
					book[input5 - 1].setName(Tch);
					System.out.println("변경이 완료되었습니다.");
				} else if (input6 == 2) {
					System.out.println("선택된 책 저자명: " + book[input5 - 1].getAuthor());
					System.out.print("변경하실 책 저자명: ");
					String Tch = scan.next();
					book[input5 - 1].setAuthor(Tch);
					System.out.println("변경이 완료되었습니다.");
				} else if (input6 == 3) {
					System.out.println("선택된 책 출판사: " + book[input5 - 1].getPublisher());
					System.out.print("변경하실 책 출판사: ");
					String Tch = scan.next();
					book[input5 - 1].setPublisher(Tch);
					System.out.println("변경이 완료되었습니다.");
				} else if (input6 == 4) {
					System.out.println("선택된 책 유형: " + book[input5 - 1].getType());
					System.out.print("변경하실 책 유형: ");
					String Tch = scan.next();
					book[input5 - 1].setType(Tch);
					System.out.println("변경이 완료되었습니다.");
				} else if (input6 == 5) {
					System.out.println("선택된 책 가격: " + book[input5 - 1].getPrice());
					System.out.print("변경하실 책 가격: ");
					int Tch = scan.nextInt();
					book[input5 - 1].setPrice(Tch);
					System.out.println("변경이 완료되었습니다.");
				}
			} else if (input1.equals("4")) {
				System.out.println("책을 추가하시겠습니까? (1.네  2.아니오)");
				int input7 = scan.nextInt();
				
				if (input7 == 1) {
					
					p++;
					System.out.println(p);
					System.out.println(book.length);
					System.out.println("책 이름을 입력하세요: ");
					String bookname = scan.next();
					book[book.length].setName(bookname);
					System.out.println("책 저자의 이름을 입력하세요: ");
					String bookAuthor = scan.next();
					book[book.length].setAuthor(bookAuthor);
					System.out.println("책 출판사를 입력하세요: ");
					String bookPublisher = scan.next();
					book[book.length].setPublisher(bookPublisher);
					System.out.println("책 유형을 입력하세요: ");
					String bookType = scan.next();
					book[book.length].setType(bookType);
					System.out.println("책 가격을 입력하세요: ");
					int bookPrice = scan.nextInt();
					book[book.length].setPrice(bookPrice);
					
				}
			}
		}

	}

}
