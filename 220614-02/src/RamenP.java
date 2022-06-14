
public class RamenP extends Ramen {
	
	private int price;

	public RamenP(String maker, String name, int price) {
		super(maker, name);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return super.toString() + "RamenP [price=" + price + "]";
	}
	
	

}
