package com.cg.library.daoservices;

public interface LibrarianDAOServices {
 public  void issueBook(int bookId);
 public String viewIssuedBook(int bookId,String status);
  
}
