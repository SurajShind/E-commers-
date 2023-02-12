package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;
import com.ecommerce.reository.CategoryRepository;
import com.ecommerce.reository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	public void addProduct(Product Product) {
		productRepository.save(Product);
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	
	public void deleteProductById(long id)
	{
		productRepository.deleteById(id);;
	}
	
	public Optional<Product> getProductById(long id)
	{
		return productRepository.findById(id);
	}
	
	public void updateProduct(Product product)
	{
		 productRepository.save(product);
	}
	
	public List<Product> getAllProductsByCategoryId(int id)
	{
		return productRepository.getAllProductsByCategoryId(id);
	}


}
