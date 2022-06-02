package com.serverApp.services;

import javax.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serverApp.models.UserData;
import com.serverApp.models.repos.UserRepo;

@Service
@Transactional
public class ApplicationService {

	@Autowired
    private UserRepo applicationRepo;

	 public List <UserData> findAll(){
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
		userData.setId();
        return applicationRepo.update(userData);
    }
}
