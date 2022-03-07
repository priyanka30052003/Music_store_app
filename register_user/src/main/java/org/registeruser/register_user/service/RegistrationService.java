package org.registeruser.register_user.service;

import java.util.List;

import org.registeruser.register_user.model.Admin;
import org.registeruser.register_user.model.Product;
import org.registeruser.register_user.model.User;
import org.registeruser.register_user.repo.ProdRepo;
import org.registeruser.register_user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
	
	@Autowired
	private UserRepo repo;

	
	public User saveUser(User user) {
		return repo.save(user);
		
	}
	public User fetchUserByUserIdAndPassword(String userId,String password) {
		return repo.findByUserIdAndPassword(userId,password);
	}
	public User fetchUserByUserId(String userId) {
		// TODO Auto-generated method stub
		return repo.findByUserId(userId);	}
	public List<User> fetchAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}





}
