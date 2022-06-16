
public class Animal {
	private String name;
	private String feedType;
	private int age;
	private int weight;
	
	public Animal(String name, String feedType, int age, int weight) {
		super();
		this.name = name;
		this.feedType = feedType;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeedType() {
		return feedType;
	}

	public void setFeedType(String feedType) {
		this.feedType = feedType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
}

//class Tiger extends Animal implements Predator {
//	public Tiger(String type, int age, int weight) {
//		super(type, age, weight);
//	}
//}
//
//class Lion extends Animal implements Predator {
//	public Lion(String type, int age, int weight) {
//		super(type, age, weight);
//	}
//}
//
//class Cow extends Animal implements Herbivore {
//	public Cow(String type, int age, int weight) {
//		super(type, age, weight);
//	}
//}
//class Eagle extends Animal implements Predator {
//	public Eagle(String type, int age, int weight) {
//		super(type, age, weight);
//	}
//}
//class Giraffe extends Animal implements Herbivore {
//	public Giraffe(String type, int age, int weight) {
//		super(type, age, weight);
//	}
//}
//class Rhino extends Animal implements Herbivore {
//	public Rhino(String type, int age, int weight) {
//		super(type, age, weight);
//	}
//}
