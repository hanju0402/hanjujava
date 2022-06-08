
public class CarArrayTest {

	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];
		

		
		

		
		
		for (int i = 0; i < cars.length; i++)
			cars[i] = new Car();
		
		for (int i = 0; i < cars.length; i++)
			cars[i].speedUp();
		
		for (Car c : cars) {
			System.out.println(c);
		}
//		for (int i = 0; i < cars.length; i++)
//			System.out.println(cars[i]);

	}

}
