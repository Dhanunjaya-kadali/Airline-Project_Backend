package com.example.ams.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ams.beans.Payment;
import com.example.ams.dao.PaymentDao;




@Service("TransactionService")
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	PaymentDao dao;
	

	public PaymentDao getDao() {
		return dao;
	}

	public void setDao(PaymentDao dao) {
		this.dao = dao;
	}

	public int addTransaction(Payment p) {
		int TrId = dao.addTransaction(p);
		return TrId;
	}

	public List<Payment> listAllTransaction() {
		System.out.println("service layer");
		List<Payment> TrasnList = dao.listAllTransaction();
		return TrasnList;
	}

	public Payment findTransactionId(int Trans_id) {
		return dao.findTransactionId(Trans_id);
	}

	public void deleteById(int TrId) {
		dao.deleteById(TrId);
		
	}
}
