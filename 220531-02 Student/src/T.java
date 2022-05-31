// 학급(반)
// 학생
// 학생
// 학생

// 1. 3명의 학생의 이름을 콘솔에 출력할 수 있음.
// 2. 학생 3명의 총 평균을 알려줄 수 있음.
// 3. 점수가 가장 높은 학생(참조)을 알려줄 수 있음. => 동일 점수. 1 < 2 < 3 순으로
// return 타입이 학생












public class T {
	private Student a; // (1) Student 클래스를 불러오면서 변수 선언을 해준다.
	private Student b;
	private Student c;

	public T(Student a, Student b, Student c) { // (2) 생성자를 등록한다.
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int avgAll() {
		System.out.print("학급 평균점수 : ");
		int sum = a.getAverage() + b.getAverage() + c.getAverage();
		return sum / 3;
	}

	public String nameAll() {
		System.out.print("출석부 : ");
		return a.getName() + "  " + b.getName() + " " + c.getName();
	}

	public String highScore() {
		System.out.print("MVP : ");
		if (a.getAverage() >= b.getAverage()) {
			if (a.getAverage() >= c.getAverage()) {
				return a.getName();
			} else {
				return c.getName();
			}
		} else if (b.getAverage() >= c.getAverage()) {
			return b.getName();
		} else {
			return c.getName();
		}
	}

}
