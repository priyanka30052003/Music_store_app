package org.registeruser.register_user.repo;

import java.util.List;

import org.registeruser.register_user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User, String>{
	
	User findByUserIdAndPassword(String userId, String password);

	User findByUserId(String userId);


}