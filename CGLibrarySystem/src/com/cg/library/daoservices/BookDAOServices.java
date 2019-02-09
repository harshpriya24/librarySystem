package com.cg.library.daoservices;

import java.util.ArrayList;
import java.util.List;

import com.cg.library.beans.Book;

public interface BookDAOServices {
 public String updateStatus(int bookId,String status);
 public Book getBookDetails(int bookId);
 public Book addBooks(Book book);
}
