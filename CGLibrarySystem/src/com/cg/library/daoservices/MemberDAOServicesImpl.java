package com.cg.library.daoservices;

import com.cg.library.beans.Book;
import com.cg.library.beans.Member;

public class MemberDAOServicesImpl implements MemberDAOServices {
 

	@Override
	public int increaseBookIssued(int memberId, int bookId) {
		Member member=new Member(memberId);
		int count=member.numberOfBooksissued;
		return count++;
		
	}

	@Override
	public int decreaseBookIssued(int memberId, int bookId) {
		Member member=new Member(memberId);
        member.bookId=bookId;
		int count=member.numberOfBooksissued;
		return count--;
	}
	
}


