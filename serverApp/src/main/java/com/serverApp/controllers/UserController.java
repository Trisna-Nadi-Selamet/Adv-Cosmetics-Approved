package com.serverApp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import com.serverApp.models.UserData;
import com.serverApp.services.ApplicationService;

@RestController
@RequestMapping("/api/app")
public class UserController {

	@Autowired
    private ApplicationService applicationService;
	
	@PostMapping
    public int create(@RequestBody UserData userData) {
        return applicationService.insert(userData);
    }
	
	@GetMapping
    public List<UserData> findAll() {
        return applicationService.findAll();
    }
	
	@GetMapping("/{id}")
    public UserData findById(@PathVariable String id) {
        return applicationService.findById(id);
    }
	
	@PutMapping
    public int update(@RequestBody UserData userData) {
        return applicationService.update(userData);
    }
}
