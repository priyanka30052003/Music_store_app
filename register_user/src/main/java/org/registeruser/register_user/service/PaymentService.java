package org.registeruser.register_user.service;

import java.util.List;

import org.registeruser.register_user.model.Payment;
import org.registeruser.register_user.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PaymentService {
	@Autowired
	private PaymentRepo repo;

	public List<Payment> fetchAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
