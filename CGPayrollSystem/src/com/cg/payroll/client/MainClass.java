package com.cg.payroll.client;

import java.util.List;
import java.util.Scanner;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   PayrollServices services=new PayrollServicesImpl();
		   	Associate associate = null;
		   	List<Associate> allAssociates;
		   	System.out.println("Enter firstName, lastName, emailId, department," + 
		   			"	 designation,  panCard,  yearlyInvestmentUnder8oC,  basicSalary,  epf,  companyPf,\r\n" + 
		   			"			accountNumber,  bankName, ifscCode");
		   int associateId=services.acceptAssociateDetails(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(), sc.next(),sc.next());           
		   System.out.println("Enter the choice");
		   System.out.println("1.To calculate the net Salary enter 1, 2. for accepting the details and generating the associate Id,3.To find one associate details,4. to get all the associates  details");
		   int index=sc.nextInt();
		   switch(index)
		   {
		   case 1: int netSalary = 0;
			try {
				netSalary = services.calculateNetSalary(associateId);
			} catch (AssociateDetailsNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		                System.out.println("NetSalary is:"+netSalary);
			            break;
		   case 2: System.out.println(associateId);
		                break;
		   case 3:   try {
				associate=services.getAssociateDetails(associateId);
			} catch (AssociateDetailsNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}      
		                  System.out.println(associate);
		                break;
		   case 4: allAssociates=services.getAllAssociateDetails();
		                  System.out.println(allAssociates);
		                break;
		   default :System.out.println("not valid option");   
		   }
		

	}
	}


