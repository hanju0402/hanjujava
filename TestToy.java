public class TestToy {
	public static void main(String[] args) {
		Toy toy1 = new Toy("새 장난감", 5000);
		
		ToyFactory fac = new ToyFactory();
		Toy chucky = fac.makeToy();
	}
}
