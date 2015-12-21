package model;

public class Product {
	private int id;
	private String name;
	private int category;
	private Double price;
	private String imgPath;
	private String description;
	private int totalAmount;
	
	public Product(String name, int category, Double price, String imgPath, String description){
		this.name = name;
		this.category = category;
		this.price = price; 
		this.imgPath = imgPath;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
