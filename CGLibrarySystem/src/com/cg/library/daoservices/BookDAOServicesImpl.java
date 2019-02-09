package com.cg.library.daoservices;

import java.util.ArrayList;
import java.util.List;

import com.cg.library.beans.Book;
import com.cg.library.util.LibraryDBUtil;

public class BookDAOServicesImpl implements BookDAOServices {

	@Override
	public String updateStatus(int bookId,String status) {
	     Book book=new Book(bookId);
	     book.setStatus(status);     
		return "Status Updated for"+book.getBookId()+book.getStatus();
	}
	
	@Override
	public Book addBooks(Book book) {
		int bookId=LibraryDBUtil.BOOK_ID_COUNTER;
		LibraryDBUtil.books.put(book.getBookId(),book);
		return book;       
	}

	@Override
	public Book getBookDetails(int bookId) {
		return LibraryDBUtil.books.get(bookId);
	}

	 

	}
