package com.ecommerce.reository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Category;
import com.ecommerce.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> getAllProductsByCategoryId(int id);
	
	Optional<Product> getProductById(long id);
}
