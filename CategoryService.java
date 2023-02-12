package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Category;
import com.ecommerce.reository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public void addCategory(Category category)
	{
		categoryRepository.save(category);
	}
	
	public List<Category> getAllCategories()
	{
		return categoryRepository.findAll();
	}
	
	public void deleteCategoryById(int id)
	{
		categoryRepository.deleteById(id);
	}
	
	public Optional<Category> updateCategoryById(int id)
	{
		return categoryRepository.findById(id);
	}
	
	public void updateCategory(Category category)
	{
		 categoryRepository.save(category);
	}
	
	public Optional<Category> getCategoryById(int id)
	{
		return categoryRepository.findById(id);
	}
}
