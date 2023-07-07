package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product extends BaseEntity{
	@Column(name="product_name",nullable = false, length = 20)
	private String productName;
	private int quantity; 
	private double price; 
	@Column(length = 40)
	private String description; 
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, int quantity, double price, String description) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", quantity=" + quantity + ", price=" + price + ", description="
				+ description + ", getId()=" + getId() + "]";
	}
	
	

}
