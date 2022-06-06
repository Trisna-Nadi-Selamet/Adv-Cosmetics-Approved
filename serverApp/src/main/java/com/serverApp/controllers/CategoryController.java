//package com.serverApp.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.serverApp.models.Category;
//import com.serverApp.services.CategoryServices;
//
//
//@RestController
//@RequestMapping("/api/category")
//public class CategoryController {
//
//	@Autowired
//    private CategoryServices categoryServices;
//
//    @PostMapping
//    public int create(@RequestBody Category category) {
//        return categoryServices.insert(category);
//    }
//
//    @GetMapping
//    public List<Category> findAll() {
//        return categoryServices.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Category findById(@PathVariable String id) {
//        return categoryServices.findById(id);
//    }
//
//    @PutMapping
//    public int update(@RequestBody Category category) {
//        return categoryServices.update(category);
//    }
//}
