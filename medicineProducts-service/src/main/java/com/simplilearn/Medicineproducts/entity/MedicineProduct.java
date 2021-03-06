package com.simplilearn.Medicineproducts.entity;

import java.util.Date;

public class MedicineProduct {

	// properties
	private int id;
	private String medicineName;
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
	public MedicineProduct() {
		super();
	}

	
	public MedicineProduct(int id, String medicineName, String companyName, double price, int quantity,
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
