package com.sopra.project;

public class Bank {
	private int bankId;
	private String bankname;
	private String accNumber;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int bankId, String bankname, String accNumber) {
		super();
		this.bankId = bankId;
		this.bankname = bankname;
		this.accNumber = accNumber;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankname=" + bankname + ", accNumber=" + accNumber + "]";
	}
	
}
