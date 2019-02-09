package com.cg.payroll.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class PayrollServicesTestEasyMock {

	private static  PayrollServices payrollServices;
	private static AssociateDAO mockAssociateDao;
	 @BeforeClass
	 public static void setUpTestEnv() {
		 mockAssociateDao=EasyMock.mock(AssociateDAO.class);
		 payrollServices=new PayrollServicesImpl(mockAssociateDao);
	 }
	 @Before
	 public void setUpTestMockData() {
		 Associate associate1= new Associate(101, new Salary(10000, 3546, 2500), new BankDetails(3546877, "Citi", "68547kjhyt"), 7896, "Harsh","Priya", "cse", "trainee","ljh87hf", "kjhghf@jhg.com");
		 Associate associate2=new Associate(102, new Salary(50000, 9769, 9877), new BankDetails(3897877, "ICICI", "68hgf654t"), 7654, "Roshan","jha", "cse", "trainee","ljh87hf", "kiuyf@iuy.com");
	
		 Associate associate3=new Associate(103, new Salary(50890, 9969, 9277), new BankDetails(3657657, "HDFC", "6354htfd9"), 3574, "jung","jassi", "cse", "trainee","l546hgf", "poiitli@iuy.com");
			
		 ArrayList<Associate> associatesList=new ArrayList<>();
		 associatesList.add(associate1);
		 associatesList.add(associate2);
		 
		 EasyMock.expect(mockAssociateDao.save(associate3)).andReturn(associate3);
		 
		 EasyMock.expect(mockAssociateDao.findOne(101)).andReturn(associate1);
		 EasyMock.expect(mockAssociateDao.findOne(102)).andReturn(associate2);
		 EasyMock.expect(mockAssociateDao.findOne(1234)).andReturn(null);
		 EasyMock.expect(mockAssociateDao.findAll()).andReturn(associatesList);
		 EasyMock.replay(mockAssociateDao);
	 }
	 
	 @Test(expected=AssociateDetailsNotFoundException.class)
	 public void testGetAssociateDetailsforInvalidAssociateId() throws AssociateDetailsNotFoundException{
		 payrollServices.getAssociateDetails(1234);
		 EasyMock.verify(mockAssociateDao.findOne(1234));
	 }
	 
	 @Test
	 public void testGetAssociateDataForValidId() throws AssociateDetailsNotFoundException {
		 Associate expectedAssociate=new Associate(101, new Salary(10000, 3546, 2500), new BankDetails(3546877, "Citi", "68547kjhyt"), 7896, "Harsh","Priya", "cse", "trainee","ljh87hf", "kjhghf@jhg.com");
		Associate actualAssociate=payrollServices.getAssociateDetails(101);
		assertEquals(expectedAssociate, actualAssociate);
		EasyMock.verify(mockAssociateDao.findOne(101));
	 }
	 @After
	 public void tearDownTestMockData() {
		 EasyMock.resetToDefault(mockAssociateDao);
	 }
	 @AfterClass
	 public static void tearDownTestEnv() {
		 mockAssociateDao=null;
		 payrollServices=null;
	 }
}
