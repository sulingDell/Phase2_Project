package com.simplilearn.userShoppingCart.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userShoppingCart")

public class UserShoppingCart {

	// properties
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="product_id")
	private int id;
	
	@Column(name="product_name")
	private String medicineName;
	
	@Column(name="company_name")	
	private String companyName;
	
	
	@Column(name="product_price")
	private double price;
	
	@Column(name="product_quantity")
	private int quantity;
	
	@Column(name="product_description")
	private String description;
	
	@Column(name="product_available")
	private boolean available;
	
	@Column(name="product_createAt")
	private Date createAt;
	
	@Column(name="product_expiredAt")
	private Date expiredAt;
	
	// get & set methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
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

	
	public UserShoppingCart(int id, String medicineName, String companyName, double price, int quantity,
			String description, boolean enabled, Date createAt, Date expiredAt) {
		super();
		this.id = id;
		this.medicineName = medicineName;
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
		return "Product [id=" + id + ", medicineName=" + medicineName + ", companyName=" + companyName + ",price=" + price + ", quantity=" + quantity +",description=" + description
				+ ", enabled=" + available + ", createAt=" + createAt + ", expiredAt=" + expiredAt + "]";
	}
	
	
	

	
	


}
