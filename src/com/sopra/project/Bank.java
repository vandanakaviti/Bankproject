package com.sopra.project;

public class Bank {
	private int bankId;
	private String bankName;
	private String accNumber;
	private double amount;
	
	public Bank() {
		super();
	}

	public Bank(int bankId, String bankName, String accNumber, double amount) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.accNumber = accNumber;
		this.amount = amount;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankname(String bankName) {
		this.bankName = bankName;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "bankId=" + bankId + ", bankName=" + bankName + ", accNumber=" + accNumber + ", amount=" + amount;
	}
}