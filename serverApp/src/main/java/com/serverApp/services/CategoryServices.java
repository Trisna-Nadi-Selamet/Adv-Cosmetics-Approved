//package com.serverApp.services;
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.serverApp.models.Category;
//import com.serverApp.models.repos.CategoryRepo;
//
//@Service
//@Transactional
//public class CategoryServices {
//
//	
//	@Autowired
//    private CategoryRepo categoryRepo;
//	
//	
//	public int insert(Category category) {
//		category.setId();
//		return categoryRepo.insert(category);
//	}
//
//	public Category findById(String id) {
//		return categoryRepo.findById(id);
//	}
//
//	public int update(Category category) {
//		category.setUpdate_date();
//		return categoryRepo.update(category);
//	}
//
//	public List<Category> findAll() {
//		return categoryRepo.findAll();
//	}
//
//}
