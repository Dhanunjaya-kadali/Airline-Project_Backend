package com.example.ams.dao;

import java.util.List;

import com.example.ams.beans.Payment;


public interface PaymentDao {
	
	public abstract int addTransaction(Payment p);
	public abstract List<Payment> listAllTransaction();
	public abstract Payment findTransactionId(int Trans_id);
	public abstract void  deleteById(int TrId);
	

}
