package com.serverApp.models;



import java.util.Date;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
@Table(name= "FlowApprovalData")
public class FlowApprovalData {
	private static final AtomicInteger count = new AtomicInteger(0);
	
    @Id
    @GeneratedValue
    private long id;
    
    @Column(name="Dataid",length = 50)
	private String dataid;
    
    @Column(name="Username")
	private int userName;
    
    @Column(name="Turn")
	private boolean turn;
    
    @Column(name="LevUser",length = 5)
   	private int levUser;
    
    @Column(name="Approved",length = 5)
	private int approved;
    
    @Column(columnDefinition="DATE")
    private Date update_date;
    
    
   
	
	public FlowApprovalData(){
		
	}
	
    public FlowApprovalData(long id,String dataid,int userName,boolean turn,int levUser,int approved,Date update_date){
		this.id = id;
		this.dataid = dataid;
		this.userName = userName;
		this.turn = turn;
		this.levUser = levUser;
		this.approved = approved;
		this.update_date = update_date;
	}

//    public String getId() {
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

	public String getDataid() {
		return dataid;
	}

	public void setDataid(String dataid) {
		this.dataid = dataid;
	}

	public int getUserName() {
		return userName;
	}

	public void setUserName(int userName) {
		this.userName = userName;
	}

	public boolean isTurn() {
		return turn;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}

	
	public int getLevUser() {
		return levUser;
	}

	public void setLevUser(int levUser) {
		this.levUser = levUser;
	}

	public int getApproved() {
		return approved;
	}

	public void setApproved(int approved) {
		this.approved = approved;
	}

	
	
}
