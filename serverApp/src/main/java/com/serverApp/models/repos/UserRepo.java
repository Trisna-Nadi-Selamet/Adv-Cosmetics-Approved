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
    public List <UserData> findAll();
	
	@Insert("INSERT INTO users(id,username,password) VALUES (#{id},#{userName},#{passWord})")
	public int insert(UserData userData);

	
	@Select("SELECT * FROM users where id = #{id}")
    public UserData findById(String id);
	
	
	@Update("Update users set userName=#{userName}, passWord=#{passWord} where id=#{id}")
    public int update(UserData userData);
	
}
