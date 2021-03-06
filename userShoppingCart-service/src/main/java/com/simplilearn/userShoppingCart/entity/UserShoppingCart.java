package com.simplilearn.userShoppingCart.entity;

import java.util.Date;

public class UserShoppingCart {

	// properties
	private int id;
	private String name;
	private String companyName;
	private double price;
	private int quantity;
	private String description;
	private boolean available;
	private Date createAt;
	private Date expiredAt;
	
	// get & set methods
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setEnabled(boolean available) {
		this.available = available;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getExpiredAt() {
		return expiredAt;
	}
	public void setExpiredAt(Date expiredAt) {
		this.expiredAt = expiredAt;
		
	}
	
	// constructor
	public UserShoppingCart() {
		super();
	}

	
	public UserShoppingCart(int id, String name, String companyName, double price, int quantity,
			String description, boolean enabled, Date createAt, Date expiredAt) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.available = enabled;
		this.createAt = createAt;
		this.expiredAt = expiredAt;
	}
	
	// override tostring
	@Override
	public String toString() {
		return "Product [id=" + id + ", medicineName=" + name + ", companyName=" + companyName + ",price=" + price + ", quantity=" + quantity +",description=" + description
				+ ", enabled=" + available + ", createAt=" + createAt + ", expiredAt=" + expiredAt + "]";
	}
	
	
	

	
	


}
