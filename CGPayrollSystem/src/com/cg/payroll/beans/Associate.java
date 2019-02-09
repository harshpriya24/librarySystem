package com.cg.payroll.beans;

public class Associate {

	private int associateId;
	private Salary salary;

	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	private BankDetails bankDetails;
	 public Associate(int associateId, Salary salary, BankDetails bankDetails, int yearlyInvestmentUnder8oC,
			String firstName, String lastName, String department, String designation, String panCard, String emailId) {
		super();
		this.associateId = associateId;
		this.salary = salary;
		this.bankDetails = bankDetails;
		this.yearlyInvestmentUnder8oC = yearlyInvestmentUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.panCard = panCard;
		this.emailId = emailId;
	}
	public Associate(int yearlyInvestmentUnder8oC, String firstName, String lastName, String department, String designation,
			String panCard, String emailId,Salary salary,BankDetails bankDetails) {
		super();
		this.yearlyInvestmentUnder8oC = yearlyInvestmentUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.panCard = panCard;
		this.emailId = emailId;
		this.salary = salary;
		this.bankDetails = bankDetails;
		
	}
	public Associate(int associateId, int yearlyInvestmentUnder8oC, String firstName, String lastName, String department,
			String designation, String panCard, String emailId) {
		super();
		this.associateId = associateId;
		this.yearlyInvestmentUnder8oC = yearlyInvestmentUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.panCard = panCard;
		this.emailId = emailId;
	}
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public int getYearlyInvestmentUnder8oC() {
		return yearlyInvestmentUnder8oC;
	}
	public void setYearlyInvestmentUnder8oC(int yearlyInvestmentUnder8oC) {
		this.yearlyInvestmentUnder8oC = yearlyInvestmentUnder8oC;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	private int yearlyInvestmentUnder8oC;
	 private String firstName,lastName,department,designation,panCard,emailId;
	}

