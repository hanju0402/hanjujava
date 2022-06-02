import java.util.*;

public class Attendance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Student[] students = new Student[3]; // 배열선언

		String input = "0";
		boolean Out = false;

		while (!Out) {

			System.out.println("-학생관리 프로그램-\n 1.학생등록  2.학생리스트 확인  3.학생 평균  4.1등 학생정보  5.종료");
			input = scan.next();

			if (input.equals("1")) {
				int nullCount = 0;
				for (int i = 0; i < students.length; i++) { // 학생등록 여유가 있는지 판별
					if (students[i] == null) {
						nullCount++;
					}
				}

				if (nullCount == 0) { // null 0이면 이 발생하는 공간이 없으므로 꽉찬상태
					System.out.println("더이상 등록할 수 없습니다.");
				} else {// null이 하나라도 있으면 등록진행
					System.out.println("학생 이름을 입력하세요 : ");
					String name = scan.next();
					System.out.println("국어 점수를 입력하세요 : ");
					int korScore = scan.nextInt();
					System.out.println("영어 점수를 입력하세요 : ");
					int engScore = scan.nextInt();
					System.out.println("수학 점수를 입력하세요 : ");
					int mathScore = scan.nextInt();

					Student student = new Student(name, korScore, engScore, mathScore);
					boolean studentCheck = false;
					for (int i = 0; i < students.length && !studentCheck; i++) {
						if (students[i] == null) { // 공간이있을떄 학생 정보를 해당 배열에 넣음
							students[i] = student;
							studentCheck = true; // 첫번째 등록때 모두 null이기 떄문에 3칸에 정보가 다 들어감
						}

					}
				}

			} else if (input.equals("2")) {
				int nullCount2 = 0;

				for (int i = 0; i < students.length; i++) {
					if (students[i] != null) {
						System.out.println(students[i].getName());
						nullCount2++;
					}

				} // else 를 줄경우 null공간이 하나라도 있는경우에 등록된 학생이 없다고 뜸

				if (nullCount2 == 0) { // nullCount2가 0 이므로 채워져있는 칸이 없다
					System.out.println("등록된 학생이 없습니다.");
				}
			} else if (input.equals("3")) {
				int nullCount3 = 0;
				boolean inOut3 = true;
				for (int i = 0; i < students.length && inOut3; i++) {
					if (students[i] != null) {
						nullCount3++;
					}
				}

				if (nullCount3 == 0) {
					System.out.println("등록된 학생이 없습니다.");

				}
				if (nullCount3 != 0) {
					System.out.println("학생 이름을 입력하세요 : ");
					String avgName = scan.next();

					for (int i = 0; i < students.length; i++) {
						if (students[i].getName().equals(avgName)) {
							System.out.println(students[i].getAverage());
							inOut3 = false; // false 로 나가야 다음 if 에서 들어가지않음
						}
					}
					if (inOut3) {
						System.out.println("등록되지 않은 이름입니다.");
					}
				}
			} else if (input.equals("4")) {
				boolean inOut4 = true;
				int rank = 0;
				for (int i = 0; i < students.length && inOut4; i++) {
					int nullCount4 = 0;
					if (students[i] != null) {
						nullCount4++;
					}

					if (nullCount4 == 0) {
						System.out.println("등록된 학생이 없습니다.");
						inOut4 = false;
					}

					if (nullCount4 != 0) {
						int max = students[i].getAverage();
						
						if (max < students[i].getAverage()) {
							max = students[i].getAverage();
						}  
						rank = i;

						System.out.println("-1등 학생 정보 - \n 이름 : " + students[rank].getName() + "\n국어점수: "
								+ students[rank].getKor() + "\n영어점수: " + students[rank].getEng() + "\n수학점수: "
								+ students[rank].getMath() + "\n평균점수: " + students[rank].getAverage());
					}
				}

			} else if (input.equals("5")) {
				System.out.println("프로그램을 종료합니다.");
				Out = true;
			} else {
				System.out.println("잘못된 선택입니다.");
			}

		}

	}
}
