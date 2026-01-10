package com.intuit.interview;

public class Transaction {
	private String status;
	private String userId;
	private double amount;
	
	public Transaction (String status,String userId,double amount) {
		this.status = status;
		this.userId = userId;
		this.amount = amount;
		
	}
	
	public String getStatus() {
		return status;
	}
	public String getUserId() {
		return userId;
	}
	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Transaction [status=" + status + ", userId=" + userId + ", amount=" + amount + "]";
	}
	
	

}
