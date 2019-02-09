package com.cg.library.client;

import java.util.Scanner;

import com.cg.library.services.LibraryServices;
import com.cg.library.services.LibraryServicesImpl;

public class MainClass {

	public static void main(String[] args) {
	
		LibraryServices services=new LibraryServicesImpl(); 
	Scanner sc=new Scanner(System.in);
	int index;
	System.out.println("Choose the service");
	System.out.println("Enter 1.issuing the book");
	System.out.println("Enter 2. returning book");
	System.out.println("Enter 3.To search book");
	index=sc.nextInt();
	switch (index) {
	case 1:  
		
		
	}
	}
}
