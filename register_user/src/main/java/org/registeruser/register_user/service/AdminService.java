package org.registeruser.register_user.service;

import org.registeruser.register_user.model.Admin;
import org.registeruser.register_user.repo.AdminRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	@Autowired
	private AdminRepo repo;
	public Admin fetchAdminByUserId(String userId) {

		return repo.findByUserId(userId);
	}
}
