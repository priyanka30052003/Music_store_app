package org.registeruser.register_user.repo;


import java.util.List;

import org.registeruser.register_user.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface ProdRepo extends JpaRepository<Product, String>{
	
	List<Product> findByCategory(String category);

	Product findById(int id);

	List<Product> findProductByCategory(String category);

	Product findProductById(int id);





}