package entities;

public class Product {
	private String productName;
	private Double price;
	
	public Product () {	
	}
	
	public Product(String productName, Double price) {
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String name) {
		this.productName = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}