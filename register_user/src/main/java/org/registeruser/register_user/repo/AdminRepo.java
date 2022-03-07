package org.registeruser.register_user.repo;

import org.registeruser.register_user.model.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, String>{

	Admin findByUserId(String userId);

}
