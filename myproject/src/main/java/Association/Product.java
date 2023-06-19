package Association;

public class Product {
	int id;
	String name;
	String description;
	
	public Product(int id,String name,String description) {
		this.id=id;
		this.description=description;
		this.name=name;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

}
