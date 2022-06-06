package com.serverApp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import com.serverApp.models.UserData;
import com.serverApp.models.repos.LoginRepository;
import com.serverApp.models.repos.UserRepo;
import com.serverApp.services.ApplicationService;
import javax.validation.Valid;
@Log4j2
@RestController
@RequestMapping("/api/app")
public class UserController {

	@Autowired
    private ApplicationService applicationService;
	
	@Autowired
    private UserRepo userRepository;
	
	@PostMapping("/register")
    public int create(@Valid @RequestBody UserData userData) {
		return applicationService.insert(userData);
    }
	
	@PostMapping("/login")
    public List<UserData> findAll() {
        return applicationService.findAll();
    }
//	@CrossOrigin()
//	@RequestMapping(value = "/login",method = RequestMethod.POST)
//    public List<UserData> findByName(@RequestBody String userName) {
//        return applicationService.findByName(userName);
//    }
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserData findById(@PathVariable String id) {
        return applicationService.findById(id);
    }
	
	@PutMapping
    public int update(@RequestBody UserData userData) {
        return applicationService.update(userData);
    }
}
