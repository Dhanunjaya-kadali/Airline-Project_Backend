package com.example.ams.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.ams.beans.Payment;


@Repository
public class PaymentDaoImpl implements PaymentDao {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public int addTransaction(Payment p) {
		em.persist(p);
		return p.getTrId();
	}

	public List<Payment> listAllTransaction() {
		String sql= "Select t From Transaction2 t";
		Query qry=em.createQuery(sql);
		List<Payment>TransList=qry.getResultList();
		System.out.println("on db server"+TransList);
		return TransList;
	}

	public Payment findTransactionId(int Trans_id) {
		System.out.println("*Found*");
		Payment a=em.find(Payment.class,Trans_id);
		return a;
	}
	
	@Transactional
	public void deleteById(int TrId) {
		Payment user=em.find(Payment.class, TrId);
		em.remove(user);
		
	}

}
