package com.serverApp.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name= "Users")
public class UserData  {

	
    @Id
    private String id;
    
    @Column(name="Username",length = 50)
    private String userName;
    
    @Column(name="Password",length = 10)
    private String passWord;
    
    
    public UserData() {
    }
    
    public UserData(String id,String userName,String passWord) {
    this.id = id;
    this.userName = userName;
    this.passWord = passWord;
    
    }
    
	public String getId() {
		return id;
	}

	public void setId() {
		UUID uuid = UUID.randomUUID();
		this.id = uuid.toString();
		
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

	@Override
	public String toString() {
		return "UserData [id=" + id + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
    
    
}
