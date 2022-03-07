package org.registeruser.register_user.repo;

import java.util.List;

import org.registeruser.register_user.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface PaymentRepo extends JpaRepository<Payment, String>{

}
