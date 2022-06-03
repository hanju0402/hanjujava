public class ToyFactory {
	private String location;
	
	public ToyFactory(String location) {
		this.location = location;
	}
	
	public Toy makeToy() {
		return new Toy("처키인형", 10000);
	}
}
