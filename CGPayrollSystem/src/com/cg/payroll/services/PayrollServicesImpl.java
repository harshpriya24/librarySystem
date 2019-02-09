package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.daoservices.AssociateDAOImpl;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;

public class PayrollServicesImpl implements PayrollServices{

	private AssociateDAO associatedao;
	
	public PayrollServicesImpl() {
		associatedao=new AssociateDAOImpl();
	}
	
	public PayrollServicesImpl(AssociateDAO associatedao) {
		super();
		this.associatedao = associatedao;
	}

	@Override
	public int acceptAssociateDetails(String firstName, String lastName, String emailId, String department,
			String designation, String panCard, int yearlyInvestmentUnder8oC, int basicSalary, int epf, int companyPf,
			int accountNumber, String bankName, String ifscCode) {
	/*	BankDetails bankDetails=new BankDetails(accountNumber, bankName, ifscCode);
		Salary salary=new Salary(basicSalary, epf, companyPf);
		Associate associate=new Associate(yearlyInvestmentUnder8oC, firstName, lastName, department, designation, panCard, emailId, salary, bankDetails);*/
		Associate associate=new Associate(yearlyInvestmentUnder8oC, firstName, lastName, department, designation, panCard, emailId, new Salary(basicSalary, epf, companyPf), new BankDetails(accountNumber, bankName, ifscCode));
		associate=associatedao.save(associate);
		/*return associatedao.save(new Associate(yearlyInvestmentUnder8oC, firstName, lastName, department, designation, panCard, emailId, new Salary(basicSalary, epf, companyPf), new BankDetails(accountNumber, bankName, ifscCode)))*/
		return associate.getAssociateId();
		
	}

	@Override
	public int calculateNetSalary(int associateId) throws AssociateDetailsNotFoundException {
		Associate associate=getAssociateDetails(associateId);
	   Salary salary=associate.getSalary();
	   int basicSalary =salary.getBasicSalary();
	   int epf=salary.getEpf();
	   int cpf=salary.getCompanyPf();
	   int hra=(30*basicSalary)/100;
	   int conAllowance=hra;
	   int  otherAllow=(25*basicSalary)/100;
	   int personalAll=(20*basicSalary)/100;
	   int grossSalary=basicSalary+epf+cpf+hra+conAllowance+otherAllow+personalAll;
	   int netSalary=grossSalary-cpf-epf;
	    
		return netSalary ;
	}

	@Override
	public Associate getAssociateDetails(int associateId) throws AssociateDetailsNotFoundException {
		Associate associate=associatedao.findOne(associateId);
				if(associate==null)
					throw new AssociateDetailsNotFoundException("Associate Details not Found for Id"+associateId);
		return associate;
	}

	@Override
	public List<Associate> getAllAssociateDetails() {
		// TODO Auto-generated method stub
		return associatedao.findAll();
	}

}
