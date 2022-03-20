package com.example.ams.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.example.ams.dao.AdminDao;
import com.example.ams.beans.Admin;

@Repository
public class AdminDaoImpl implements AdminDao{

	@PersistenceContext
	EntityManager em;
	

	@Transactional
	public int addAdmin(Admin admin) {
		em.persist(admin);
		return admin.getAdminId();
	}

	
	public Admin findAdminById(int adminId) {
		
		Admin ad = em.find(Admin.class, adminId);
	  	 return ad;
	}

	
	public List<Admin> listAllAdmin() {
		String sql = "Select a from Admin a";
		Query qry = em.createQuery(sql);
		List<Admin> admin = qry.getResultList();
		//System.out.println(flight);
		return admin;
	}
	
	
	@Transactional
	public int updateAdmin(int adminId, String adminName) {
		Admin ad = em.find(Admin.class, adminId);
		ad.setAdminName(adminName);
		em.merge(ad);
		return ad.getAdminId();
	}


	@Transactional
	public int deleteById(int adminId) {
		Admin ad = em.find(Admin.class, adminId);
		em.remove(ad);
		return ad.getAdminId();
	}


	

}