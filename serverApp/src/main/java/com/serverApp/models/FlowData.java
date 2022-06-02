package com.serverApp.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Flowdata")
public class FlowData  {

	
    @Id
    private String id;
    @Column(name="FlowData",length = 20)
	private String flowData;
    
    @Column(name="Description",length = 100)
	private String desc;
    
    @Column(name="Category",length = 50)
	private String category;
    
    @Column(name="Status",length = 20)
	private String status;
	
	
	public FlowData() {
    }
	public FlowData(String id,String flowData,String desc,String category,String status) {
    this.id = id;
	this.flowData = flowData;
    this.desc = desc;
    this.category = category;
    this.status = status;
	}
	
	public String getId() {
		return id;
	}

	public void setId() {
		UUID uuid = UUID.randomUUID();
		this.id = uuid.toString();
		
	}
	
	public String getFlowData() {
		return flowData;
	}
	public void setFlowData(String flowData) {
		this.flowData = flowData;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "FlowData [id=" + id + ", flowData=" + flowData + ", desc=" + desc + ", category=" + category
				+ ", status=" + status + "]";
	}
	
	
	
	
}
