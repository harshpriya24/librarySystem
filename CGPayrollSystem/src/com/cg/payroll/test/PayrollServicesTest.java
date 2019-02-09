package com.cg.payroll.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
import com.cg.payroll.util.PayrollDBUtil;

public class PayrollServicesTest {

	private static PayrollServices services;
@BeforeClass
public static void setUpTestEnv() {
	services=new PayrollServicesImpl();
}
 @Before
 public void setUpTestData() {
	 Associate associate=new Associate(101, new Salary(10000, 3546, 2500), new BankDetails(3546877, "Citi", "68547kjhyt"), 7896, "Harsh","Priya", "cse", "trainee","ljh87hf", "kjhghf@jhg.com");
	 Associate associate2=new Associate(102, new Salary(50000, 9769, 9877), new BankDetails(3897877, "ICICI", "68hgf654t"), 7654, "Roshan","jha", "cse", "trainee","ljh87hf", "kiuyf@iuy.com");
		PayrollDBUtil.associates.put(associate.getAssociateId(),associate)	;
		PayrollDBUtil.associates.put(associate2.getAssociateId(), associate2);
		
		PayrollDBUtil.ASSOCIATE_ID_COUNTER=102;
 }

 @Test(expected=AssociateDetailsNotFoundException.class)
 public void testGetAssociateDetailsForInvalidAssociateId() throws AssociateDetailsNotFoundException{
	 services.getAssociateDetails(12345);
 }
@Test
public void testGetAssociateDetailsForValidAssociateId() throws AssociateDetailsNotFoundException{
	Associate expectedAssociate=new Associate(101, new Salary(10000, 3546, 2500), new BankDetails(3546877, "Citi", "68547kjhyt"), 7896, "Harsh","Priya", "cse", "trainee","ljh87hf", "kjhghf@jhg.com");
   Associate actualAssociate=services.getAssociateDetails(101);
   Assert.assertEquals(expectedAssociate, actualAssociate);
} 
@Test
public void testAcceptAssociateDetailsForValidData() {
	int expectedId=103;
	int actualId=services.acceptAssociateDetails("garima", "muskan", "hgfd@kjh.com", "cse", "Trainee", "kytf765khgf", 3579, 20150, 2451, 354546, 254646, "citi", "yf7654hgf");
	Assert.assertEquals(expectedId, actualId);
}
@Test(expected=AssociateDetailsNotFoundException.class)
public void testCalculateNetSalaryForInvalidAssociateId() throws AssociateDetailsNotFoundException{
	services.getAssociateDetails(12345);
}
@Test
public void testGetAllAssociatesDetails() {
	 Associate associate=new Associate(101, new Salary(10000, 3546, 2500), new BankDetails(3546877, "Citi", "68547kjhyt"), 7896, "Harsh","Priya", "cse", "trainee","ljh87hf", "kjhghf@jhg.com");
	 Associate associate2=new Associate(102, new Salary(50000, 9769, 9877), new BankDetails(3897877, "ICICI", "68hgf654t"), 7654, "Roshan","jha", "cse", "trainee","ljh87hf", "kiuyf@iuy.com");
	 ArrayList<Associate> expectedAssociatesList=(ArrayList<Associate>)services.getAllAssociateDetails();
	 expectedAssociatesList.add(associate);
	 expectedAssociatesList.add(associate2);
	 ArrayList<Associate> actualAssociateList=(ArrayList<Associate>)services.getAllAssociateDetails();
	 Assert.assertEquals(expectedAssociatesList, actualAssociateList);
}
@After
public void tearDownTestData() {
	PayrollDBUtil.associates.clear();
	PayrollDBUtil.ASSOCIATE_ID_COUNTER=100;
}
@AfterClass
public static void tearDownTestEnv() {
	services=null;
}
}
