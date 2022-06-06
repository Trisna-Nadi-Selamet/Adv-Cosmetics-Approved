package com.serverApp.models.repos;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.serverApp.models.FlowData;

import org.apache.ibatis.annotations.Update;

@Mapper
public interface FlowDataRepo {

	@Select("SELECT * FROM flowdata ")
    public  List <FlowData> findAll();

	
    @Select("SELECT * FROM flowdata WHERE id = #{id}")
    public FlowData findById(String id);

  
    @Insert("INSERT INTO flowdata(id,dataid,description,category,username,status) VALUES (#{id}, #{dataid}, #{description}, #{category}, #{userName}, #{status})")
    public int insert(FlowData flowData);

    @Update("UPDATE flowdata SET dataid = #{dataid}, description = #{description}, category = #{category}, status = #{status} WHERE id = #{id}")
    public int update(FlowData flowData);


}
