package com.cg.library.beans;

public class Member {
	private  int memberId;
	private String name;
	private String address;
	private String dateOfMembership;
	private String typeOfMembership;
	private String periodOfMembership;
	public int numberOfBooksissued;
	public  int bookId;

public Member() {}
 
public Member(int memberId) {
	super();
	this.memberId = memberId;
}


public Member(String name, String address, String dateOfMembership, String typeOfMembership,
		String periodOfMembership,int numberOfBooksissued,int bookId) {
	super();
	this.name = name;
	this.address = address;
	this.dateOfMembership = dateOfMembership;
	this.typeOfMembership = typeOfMembership;
	this.periodOfMembership = periodOfMembership;
	this.numberOfBooksissued = numberOfBooksissued;
	this.bookId=bookId;
}

public Member(int memberId, String name, String address, String dateOfMembership, String typeOfMembership,String periodOfMembership,int numberOfBooksissued,int bookId) {
	super();
	this.memberId = memberId;
	this.name = name;
	this.address = address;
	this.dateOfMembership = dateOfMembership;
	this.typeOfMembership = typeOfMembership;
	this.periodOfMembership = periodOfMembership;
	this.numberOfBooksissued = numberOfBooksissued;
	this.bookId=bookId;

}

public int getMemberId() {
	return memberId;
}
public void setMemberId(int memberId) {
	this.memberId = memberId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDateOfMembership() {
	return dateOfMembership;
}
public void setDateOfMembership(String dateOfMembership) {
	this.dateOfMembership = dateOfMembership;
}
public String getTypeOfMembership() {
	return typeOfMembership;
}
public void setTypeOfMembership(String typeOfMembership) {
	this.typeOfMembership = typeOfMembership;
}
 
public String getPeriodOfMembership() {
	return periodOfMembership;
}

public void setPeriodOfMembership(String periodOfMembership) {
	this.periodOfMembership = periodOfMembership;
}


public int getNumberOfBooksissued() {
	return numberOfBooksissued;
}

public void setNumberOfBooksissued(int numberOfBooksissued) {
	this.numberOfBooksissued = numberOfBooksissued;
}

public int getBookId() {
	return bookId;
}

public void setBookId(int bookId) {
	this.bookId = bookId;
}

}
