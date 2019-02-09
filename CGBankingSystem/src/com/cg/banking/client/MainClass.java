package com.cg.banking.client;

import java.util.Scanner;

import com.cg.banking.beans.Account;
import com.cg.banking.execptions.AccountBlockedException;
import com.cg.banking.execptions.AccountNotFoundException;
import com.cg.banking.execptions.BankingServicesDownException;
import com.cg.banking.execptions.InsufficientAmountException;
import com.cg.banking.execptions.InvalidAccountException;
import com.cg.banking.execptions.InvalidAmountException;
import com.cg.banking.execptions.InvalidPinNumberException;
import com.cg.banking.services.BankingServices;
import com.cg.banking.services.BankingServicesImpl;

public class MainClass {

	public static void main(String[] args) {

		long accNo;
		int pinNo,accNoFrom,accNoTo;
		float amount;
		BankingServices services=new BankingServicesImpl();
		Account c1=null;
		Account c2=null;
		System.out.println("");

		try {
			c1=services.openAccount("Savings",2000);
		} catch (InvalidAmountException |InvalidAccountException |BankingServicesDownException e) {
			e.printStackTrace();
		}
		c1.setAccountStatus("Active");
		try {
			c2=services.openAccount("Savings", 9000);
		} catch (InvalidAmountException|InvalidAccountException |BankingServicesDownException e) {
			e.printStackTrace();
		}
		c2.setAccountStatus("Active");

		System.out.println("Account details\n"+c1);
		System.out.println("Account details\n"+c2);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1 for Withdraw");
		System.out.println("Enter 2 for Deposit");
		System.out.println("Enter 3 for Fund Transfer");
		System.out.println("Enter 4 for Account Status");
		System.out.println("Enter the choice");
		int index=sc.nextInt();
		switch (index) {
		case 1: System.out.println("Withdraw");
		System.out.println("Enter the account number from which the money is to be with drawn ");
		accNo=sc.nextInt();
		System.out.println("Enter the amount of money to be withdrawn ");
		amount=sc.nextInt();
		System.out.println("Enter pin number");
		pinNo=sc.nextInt();
		try {
			System.out.println(services.withdrawAmount(accNo, amount, pinNo));
			System.out.println("AccountDetails after withdrawal"+services.getAccountDetails(accNo));
		} catch (AccountNotFoundException |InvalidPinNumberException |InsufficientAmountException|AccountBlockedException |BankingServicesDownException e) {
			System.out.println(e.getMessage());
		} 
		
		break;
		case 2:   System.out.println("Deposit");
		System.out.println("Enter account number");
		accNo=sc.nextInt();
		System.out.println("eNTER AMOUNT TO  BE DEPOSITED");
		amount=sc.nextInt();
		try {
			System.out.println(services.depositAmount(accNo, amount));
		} catch (AccountNotFoundException e) {
			e.printStackTrace();
		} catch (BankingServicesDownException e) {
			e.printStackTrace();
		} catch (AccountBlockedException e) {
			e.printStackTrace();
		}
		break;
		case 3:     System.out.println("Fund Transfer");
		System.out.println("Enter the account number from which money");
		accNoFrom=sc.nextInt();
		System.out.println("Enter the pin number");
		pinNo=sc.nextInt();
		System.out.println("enter the acc to which amount has to be deposited");
		accNoTo=sc.nextInt();
		System.out.println("Enter the amount");
		float transferAmount=sc.nextInt();     
		boolean b = false;
		try {
			b = services.fundTransfer(accNoTo,accNoFrom ,transferAmount, pinNo);
		} catch (InsufficientAmountException|AccountNotFoundException|InvalidPinNumberException| BankingServicesDownException|AccountBlockedException e) {
			e.printStackTrace();
		} 
		if(b) {
			try {
				System.out.println("Account Status of Depositor "+services.getAccountDetails(accNoFrom));
			} catch (BankingServicesDownException | AccountNotFoundException e) {
				e.printStackTrace();
			}
			try {
				System.out.println("Account Status of Receiver\n"+services.getAccountDetails(accNoTo));
			} catch (BankingServicesDownException e) {
				e.printStackTrace();
			} catch (AccountNotFoundException e) {
				e.printStackTrace();
			}
		}
		break;
		default:System.out.println("Enter correct option");
			break;
		}

	}

}

