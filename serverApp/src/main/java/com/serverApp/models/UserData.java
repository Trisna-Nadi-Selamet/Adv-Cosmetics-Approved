package com.serverApp.models;
import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;


@Entity
@Table(name= "Users")

public class UserData  {

	private static final AtomicInteger count = new AtomicInteger(0); 
	
    @Id
    @GeneratedValue
    private long id;
    
    @Column(name="Username",length = 50)
    private @NotBlank String userName;
    
    @Column(name="Password",length = 10)
    private @NotBlank String passWord;
    
    @Column(columnDefinition="DATE")
    private Date update_date;
    @Column(name="Loggedin")
    private boolean loggEdin;
    
    public UserData() {
    }
    
    public UserData(long id,String userName,String passWord,Date update_date,boolean loggEdin) {
    this.id = id;
    this.userName = userName;
    this.passWord = passWord;
    this.update_date = update_date;
    this.loggEdin = loggEdin; 
    
    }
    
    
//	public String getId() {
//		return id;
//	}
//
//	public void setId() {
//		UUID uuid = UUID.randomUUID();
//		this.id = uuid.toString();
//		
//	}

    public long getId() {
		return id;
	}

	public void setId() {
		this.id = count.incrementAndGet();
	}

	public Date getUpdate_date() {
		return update_date;
	}

	

	public void setUpdate_date() {
		this.update_date = new Date();;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public boolean isLoggEdin() {
		return loggEdin;
	}

	public void setLoggEdin(boolean loggEdin) {
		this.loggEdin = loggEdin;
	}



}
