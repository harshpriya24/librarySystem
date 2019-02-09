package com.cg.banking.daoservices;

import java.util.List;

import com.cg.banking.beans.Transaction;

public interface TransactionDAO {
 Transaction save(long accountNo,Transaction transaction);
 Transaction findOne(long  accountNo,int traansactionid);
 List<Transaction> findAll(long accNo);
}
