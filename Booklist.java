
public class Booklist {
	private String name;
	private String author;
	private String publisher;
	private String type;
	private int price;
	
	
	public Booklist(String name, String author, String publisher, String type, int price) {
		super();
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.type = type;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	

}
