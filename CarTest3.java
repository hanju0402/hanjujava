
class Car {
	private String color;
	private int speed;
	private int gear;
	//자동차 시리얼 번호
	private int id;
	// 실체화된 Car 객체의 개수를 위한 정적 변수
	// 필드 안에 있지만 필드값이 아님
	public static final int SHARE_NUMBER = 22;
	private static int numberOfCars = 0;
	//static은 public 으로 하면 값이 왜바꼇는지 찾기 어렵다.
	// 그나마 static은 private로 하는게 좋다
	// static 은 만들면 편한대 미래를 생각하면 어려울수있다.
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		// 자동차의 개수를 증가하고 id 번호를 할당한다.
		id = ++numberOfCars;
	}
	
	public static void printColor() {
		System.out.println(color);
	}
	
	public void printStaticNumber() {
		System.out.println(numberOfCars);
	}
	
	//정적 메소드
	public static int getNumberOfCars() {
		return numberOfCars; // OK
	}

}


public class CarTest3 {
	public static void main(String[] args) {
		
		
		
		
		
		
		

		
		
		
		
		
//		Car.printStaticNumber();
		
//		int n = Car.getNumberOfCars();
//		System.out.println("지금까지 생성된 자동차 수 = " + n);
		
//		
//		Car c1 = new Car("blue", 100, 1);
//		c1.printStaticNumber();
//		Car c2 = new Car("white", 0, 1);
//		
//		n = Car.getNumberOfCars();
//		System.out.println("지금까지 생성된 자동차 수 = " + n);
	}
}
