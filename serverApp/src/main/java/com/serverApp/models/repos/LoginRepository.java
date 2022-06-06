package com.serverApp.models.repos;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.serverApp.models.UserData;

@Repository
public interface LoginRepository extends JpaRepository<UserData ,String>{

	


}
