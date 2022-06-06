package com.serverApp.models.repos;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.serverApp.models.FlowApprovalData;

@Mapper
public interface FlowApprovalDataRepo {

	@Select("SELECT * FROM flow_approval_data ")
    public  List <FlowApprovalData> findAll();

	
    @Select("SELECT * FROM flow_approval_data WHERE id = #{id}")
    public FlowApprovalData findById(String id);

  
    @Insert("INSERT INTO flow_approval_data(id,dataid,username,turn,approved) VALUES (#{id}, #{dataid}, #{userName}, #{turn}, #{approved})")
    public int insert(FlowApprovalData flowApprovalData);

    
    @Update("UPDATE flow_approval_data SET dataid = #{dataid}, userName = #{userName}, turn = #{turn}, approved = #{approved} WHERE id = #{id}")
    public int update(FlowApprovalData flowApprovalData);
}
