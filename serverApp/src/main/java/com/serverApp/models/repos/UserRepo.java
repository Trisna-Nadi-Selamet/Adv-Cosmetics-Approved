package com.serverApp.models.repos;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.serverApp.models.UserData;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface UserRepo {

	@Select("SELECT * FROM users ")
	//@Select("SELECT * FROM users WHERE username = #{userName}")
    public List <UserData> findAll();
	
	@Select("SELECT * FROM users WHERE id = #{id}")
    public UserData findById(String id);
	
	@Select("SELECT * FROM users WHERE username = #{userName}")
	public List<UserData> findByName(String userName);
	
	
	@Insert("INSERT INTO users(id,username,password) VALUES (#{id},#{userName},#{passWord})")
	public int insert(UserData userData);
	
	
	@Update("UPDATE users SET userName = #{userName}, passWord = #{passWord} WHERE id=  #{id}")
    public int update(UserData userData);

	

	
}
