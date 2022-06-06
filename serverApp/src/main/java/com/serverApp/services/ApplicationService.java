package com.serverApp.services;

import javax.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serverApp.controllers.UserController;
import com.serverApp.models.UserData;
import com.serverApp.models.repos.UserRepo;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@Transactional
public class ApplicationService {

	@Autowired
    private UserRepo applicationRepo;

	 public  List <UserData> findAll(){
		 return applicationRepo.findAll();
	    }

	public int insert(UserData userData) {
		userData.setId();
		return applicationRepo.insert(userData);
		
    }
	public UserData findById(String id) {
        return applicationRepo.findById(id);
    }
	
	public int update(UserData userData) {
		userData.setUpdate_date();
        return applicationRepo.update(userData);
    }

	public List<UserData> findByName(String userName) {
		return applicationRepo.findByName(userName);
	}

	
}
