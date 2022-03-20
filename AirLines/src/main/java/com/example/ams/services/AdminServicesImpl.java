package com.example.ams.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ams.beans.Admin;
import com.example.ams.dao.AdminDao;

@Service("adminService")
public class AdminServicesImpl implements AdminServices {

	@Autowired
	AdminDao dao;
	
	public AdminDao getDao() {
		return dao;
	}

	public void setDao(AdminDao dao) {
		this.dao = dao;
	}

	
	public int addAdmin(Admin admin) {
		int ad = dao.addAdmin(admin);
		return ad;
	}

	
	public Admin findAdminById(int adminId) {
		
		Admin ad = dao.findAdminById(adminId);
		return ad;
	}

	
	public List<Admin> listAllAdmin() {
		List<Admin> ad = dao.listAllAdmin();
		return ad;
	}

	
	public int updateAdmin(int adminId, String adminName) {
		int admin = dao.updateAdmin(adminId, adminName);
		return admin;
	}

	
	public int deleteById(int adminId) {
		int del = dao.deleteById(adminId);
		return del;
	}

}
