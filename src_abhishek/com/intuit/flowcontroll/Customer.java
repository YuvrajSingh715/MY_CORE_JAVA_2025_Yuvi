package com.intuit.flowcontroll;

public class Customer {

	private String name;
	private int customerId;
	private String product;

//-----------------Constructor---------------\\	
	public Customer(String name, int customerId, String product) {
		this.name = name;
		this.customerId = customerId;
		this.product = product;
	}

//------------------Setter-------------------\\
	public void setName(String name) {
		this.name = name;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setProduct(String product) {
		this.product = product;
	}

//------------------Getter-------------------\\
	public String name() {
		return name;
	}

	public int customerId() {
		return customerId;
	}

	public String product() {
		return product;
	}
//----------------Override-------------------\\
	public String toString() {
		return "[name = " + name + " :: customerId = " + customerId +
				" :: product = " + product + "]";
	}

}
