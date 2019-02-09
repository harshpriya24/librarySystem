package com.cg.banking.daoservices;

import java.util.ArrayList;
import java.util.List;

import com.cg.banking.beans.Transaction;
import com.cg.banking.util.BankingDBUtil;

public class TransactionDAOImpl implements TransactionDAO{

	@Override
	public Transaction save(long accountNo,Transaction transaction) {
		transaction.setTransactionId(BankingDBUtil.getTRANSANCTION_NUMBER());
		BankingDBUtil.accounts.get(accountNo).getTransactions().put((long)transaction.getTransactionId(),transaction);
		return transaction;
	}

	

	@Override
	public Transaction findOne(long accountNo,int traansactionid) {
	
		 	return BankingDBUtil.accounts.get(accountNo).getTransactions().get(traansactionid);
	}

	@Override
	public List<Transaction> findAll(long accNo) {
		
	
		return new ArrayList<Transaction>(BankingDBUtil.accounts.get(accNo).getTransactions().values());
	}

}
