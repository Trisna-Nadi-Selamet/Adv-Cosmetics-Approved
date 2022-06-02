package com.serverApp.models.repos;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.serverApp.models.FlowData;

import org.apache.ibatis.annotations.Update;

@Mapper
public interface FlowDataRepo {

	@Select("SELECT * FROM FLOWDATA ")
    public  List <FlowData> findAll();

    @Select("SELECT * FROM FLOWDATA WHERE ID = #{id}")
    public FlowData findById(String id);

    // @Delete("SELECT * FROM FLOWDATA WHERE ID = #{id}")
    // public int deleteById(String id);

    @Insert("INSERT INTO FLOWDATA (ID, FLOWDATA,DESCRIPTION,CATEGORY,STATUS) VALUES (#{id}, #{flowdata}, #{description}, #{category}, #{status})")
    public int insert(FlowData flowData);

    @Update("Update FLOWDATA set flowdata=#{flowdata}, description=#{description}, category=#{category}, status=#{status} where id=#{id}")
    public int update(FlowData flowData);


}
