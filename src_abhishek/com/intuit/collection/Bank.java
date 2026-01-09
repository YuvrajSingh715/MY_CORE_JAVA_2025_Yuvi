package com.intuit.collection;

public class Bank implements Comparable<Bank>{

	private String accountName;
	private Long accountNumber;
	private String accountHolderName;
	private String address;
	private Long mobileNumber;
	
	public Bank() {
		
	}

	public Bank(String accountName, Long accountNumber, String accountHolderName, String address, Long mobileNumber) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.address = address;
		this.mobileNumber = mobileNumber;

	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;

	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;

	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;

	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
		
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobilenumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	public String toString() {
		return "Bank Details = [ACCOUNT NAME: "+accountName +" , ACCOUNT NUMBER: "  +accountNumber +" , ACCOUNT HOLDER NAME: " +accountHolderName
	
	+" , ADDRESS: " +address +" , MOBILE NUMBER: "+mobileNumber+"]";
	
	}

	@Override
	public int compareTo(Bank o) {
		
		int accName = this.accountName.compareTo(o.getAccountName());
		if(accName != 0)
			return accName;
		int accNum = this.accountNumber.compareTo(o.getAccountNumber());
		if(accNum != 0)
		return accNum;
		
		return Long.compare(this.mobileNumber, o.mobileNumber);
		
	}


	
	
}

