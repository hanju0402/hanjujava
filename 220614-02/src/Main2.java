//컵라면
//제조사
//이름
//가격

// 생성자, 게터세터

// Override
// toString
// equals - 제조사와 이름이 같으면




public class Main2 {

	public static void main(String[] args) {
		Ramen r = new RamenP("samyang", "왕뚜껑", 1900);
		Ramen r2 = new RamenP("samyang", "왕뚜껑", 1950);
		Ramen r3 = new Ramen("농심", "신라면");
		
		System.out.println(r3.toString());
		System.out.println(r3.equals(r2));
				
	

	}

}
