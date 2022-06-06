package com.serverApp.models;


import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;

@Entity
@Table(name= "Flowdata")
public class FlowData  {
	private static final AtomicInteger count = new AtomicInteger(0); 
	
    @Id
    @GeneratedValue
    private long id;
    @Column(name="Dataid",length = 20)
	private String dataid;
    
    @Column(name="Description",length = 100)
	private String description;
    
    @Column(name="Category",length = 50)
	private String category;
    
    @Column(name="Username",length = 50)
	private String userName;
    
    @Column(name="Status",length = 20)
	private String status;
    
    @Column(columnDefinition="DATE")
    private Date update_date;
    
    
    
	
	public FlowData() {
    }
	public FlowData(long id,String dataid,String description,String category,String userName,String status,Date update_date ) {
    this.id = id;
	this.dataid = dataid;
    this.description = description;
    this.category = category;
    this.userName = userName;
    this.status = status;
    this.update_date = update_date;
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
	
	
	public Date getUpdate_date() {
		return update_date;
	}

	
	public long getId() {
		return id;
	}
	public void setId() {
		this.id = count.incrementAndGet();
	}
	public void setUpdate_date() {
		this.update_date = new Date();;
	}
	public String getDataid() {
		return dataid;
	}
	public void setDataid(String dataid) {
		this.dataid = dataid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
		
}
