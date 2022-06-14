
public class Ramen {
	private String maker;
	private String name;
	
	public Ramen(String maker, String name) {
		super();
		this.maker = maker;
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ramen [maker=" + maker + ", name=" + name + "]";
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Ramen) {
			return maker.equals(((Ramen) obj).maker) && name.equals(((Ramen) obj).name);
		} else {
			return false;
		}
	}
	
	

}
