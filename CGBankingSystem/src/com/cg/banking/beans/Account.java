package com.cg.banking.beans;

import java.util.List;
import java.util.Map;

public class Account {
private long accountNo;
private int pinNumber;
private String accountStatus;
private String accountType;
private float accountBalance;
private Map<Long,Transaction> transactions;
 
public Account() {
	// TODO Auto-generated constructor stub
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Float.floatToIntBits(accountBalance);
	result = prime * result + (int) (accountNo ^ (accountNo >>> 32));
	result = prime * result + ((accountStatus == null) ? 0 : accountStatus.hashCode());
	result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
	result = prime * result + pinNumber;
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Account other = (Account) obj;
	if (Float.floatToIntBits(accountBalance) != Float.floatToIntBits(other.accountBalance))
		return false;
	if (accountNo != other.accountNo)
		return false;
	if (accountStatus == null) {
		if (other.accountStatus != null)
			return false;
	} else if (!accountStatus.equals(other.accountStatus))
		return false;
	if (accountType != other.accountType)
		return false;
	if (pinNumber != other.pinNumber)
		return false;
	return true;
}

public Account(long accountNo, int pinNumber, String accountType, String accountStatus, float accountBalance,
		Map<Long,Transaction> transactions) {
	super();
	this.accountNo = accountNo;
	this.pinNumber = pinNumber;
	this.accountType = accountType;
	this.accountStatus = accountStatus;
	this.accountBalance = accountBalance;
	this.transactions = transactions;
}

public Account(long accountNo) {
	super();
	this.accountNo = accountNo;
}

public Account(String accountType, float accountBalance) {
	super();
	this.accountType = accountType;
	this.accountBalance = accountBalance;
}

public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public int getPinNumber() {
	return pinNumber;
}
public void setPinNumber(int pinNumber) {
	this.pinNumber = pinNumber;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public String getAccountStatus() {
	return accountStatus;
}
public void setAccountStatus(String accountStatus) {
	this.accountStatus = accountStatus;
}
public float getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(float accountBalance) {
	this.accountBalance = accountBalance;
}
public Map<Long,Transaction> getTransactions() {
	return transactions;
}
public void setTransactions(Map<Long,Transaction> transactions) {
	this.transactions = transactions;
}

@Override
public String toString() {
	return "Account [accountNo=" + accountNo + ", pinNumber=" + pinNumber + ", accountType=" + accountType
			+ ", accountStatus=" + accountStatus + ", accountBalance=" + accountBalance + ", transactions="
			+ transactions + "]";
}
}
