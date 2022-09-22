package com.sopra.project;

import java.util.Scanner;

public class Main {

	static double withdraw(Bank bank, double withdrawlAmount) {
		double amount = bank.getAmount();
		if ((amount - withdrawlAmount) > 0) {
			bank.setAmount(amount - withdrawlAmount);
			System.out.println("Withdrawl of " + withdrawlAmount + " is made in the bank account - "
					+ bank.getAccNumber() + "\nRemaining balance : " + bank.getAmount() + "\n");
		} else {
			System.out.println("Insufficient balance");
			System.out.println("Failed to Withdraw " + withdrawlAmount + " from the bank account - "
					+ bank.getAccNumber() + "\nRemaining balance : " + bank.getAmount() + "\n");
		}

		return bank.getAmount();
	}

	static double deposit(Bank bank, double depositAmount) {
		double amount = bank.getAmount();
		bank.setAmount(amount + depositAmount);
		System.out.println("Deposit of " + depositAmount + " is made in the bank account - " + bank.getAccNumber()
				+ "\nRemaining balance : " + bank.getAmount() + "\n");
		return bank.getAmount();

	}

	static void display(Bank bank) {
		System.out.println(bank);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter bank id : ");
		int bankId = sc.nextInt();

		System.out.print("Enter bank name : ");
		String bankName = sc.next();

		System.out.print("Enter bank account number : ");
		String accNumber = sc.next();

		System.out.print("Enter amount : ");
		double amount = sc.nextDouble();
		System.out.println();

		Bank bank = new Bank(bankId, bankName, accNumber, amount);

		System.out.print("Enter amount to deposit : ");
		double depositAmount = sc.nextDouble();
		double remAmount = deposit(bank, depositAmount);

		System.out.print("Enter amount to withdraw : ");
		double withdrawlAmount = sc.nextDouble();
		remAmount = withdraw(bank, withdrawlAmount);

		System.out.println("Bank details : ");
		display(bank);
	}

}
