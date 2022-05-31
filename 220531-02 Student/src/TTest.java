
public class TTest {

	public static void main(String[] args) { // (3) 인스턴스를 각각 만들어 학생들의 정보를 입력해준다.
		Student student1 = new Student("짱구", 50, 70, 60);
		Student student2 = new Student("맹구", 10, 60, 80);
		Student student3 = new Student("철수", 50, 20, 90);
		
	
		T test = new T(student1, student2, student3); // 새로운 인스턴스 생성해주는게 중요하다!!
		
		
		System.out.println(test.avgAll());
		System.out.println(test.nameAll());
		System.out.println(test.highScore());

	}

}
