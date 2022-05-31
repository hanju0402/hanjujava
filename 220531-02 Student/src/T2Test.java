
public class T2Test {

	public static void main(String[] args) {
		
		T2 studentName = new T2("짱구", "맹구", "철수");
		
		String studentA = studentName.getA();
		String studentB = studentName.getB();
		String studentC = studentName.getC();
		
		System.out.println(studentA);
		System.out.println(studentB);
		System.out.println(studentC);
		

	}

}
