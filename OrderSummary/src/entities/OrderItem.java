package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//Metodo para obter o subtotal do produto
	public double subTotal() {
		return price*quantity;
	}
	
	//Formacao do print do produto e suas informacoes
	public String toString() {
		return product.getProductName()
				+ ", Price: $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity 
				+ " = subtotal: $" 
				+ String.format("%.2f", subTotal()); 
	}
}
