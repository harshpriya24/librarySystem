package com.cg.library.daoservices;

import com.cg.library.beans.Book;

public interface MemberDAOServices {
 public int increaseBookIssued(int memberId,int bookId);
 public int decreaseBookIssued(int memberId,int bookId);
}
