package com.simplilearn.userAccounts.entity;

import java.util.Date;

public class UserAccount {

	// properties
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private int phone;
	private String dob;
	private String address;
	private double amount;
	private boolean enabled;
	private Date createAt;
	
	
	// get & set methods
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}


	// constructor
	
	public UserAccount () {
		super();
	}
	
		public UserAccount(int id, String firstName, String lastName, String password, String email, int phone, String dob,
			String address, double amount, boolean enabled, Date createAt) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.address = address;
		this.amount = amount;
		this.enabled = enabled;
		this.createAt = createAt;
	}

		@Override
		public String toString() {
			return "UserAccount [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
					+ password + ", email=" + email + ", phone=" + phone + ", dob=" + dob + ", address=" + address
					+ ", amount=" + amount + ", enabled=" + enabled + ", createAt=" + createAt + "]";
		}

	
	


	
	
	
	
	
	

	
	
	
	
}