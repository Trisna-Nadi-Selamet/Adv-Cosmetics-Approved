package com.serverApp.models;



import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "FlowApprovalData")
public class FlowApprovalData {
	
	
    @Id
    private String id;
    
    @Column(name="Approval",length = 50)
	private String approval;
    
    @Column(name="FlowData",length = 50)
	private String flowData;
    
    @Column(name="Username")
	private int userName;
    
    @Column(name="Turn")
	private boolean turn;
    
    @Column(name="Approve",length = 5)
	private int approve;
	
	public FlowApprovalData(){
		
	}
	
    public FlowApprovalData(String id,String approval,String flowData,int userName,boolean turn,int approve){
		this.id = id;
		this.approval = approval;
		this.flowData = flowData;
		this.userName = userName;
		this.turn = turn;
		this.approve = approve;
	}

    public String getId() {
		return id;
	}

	public void setId() {
		UUID uuid = UUID.randomUUID();
		this.id = uuid.toString();
		
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

	public String getFlowData() {
		return flowData;
	}

	public void setFlowData(String flowData) {
		this.flowData = flowData;
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

	public int getApprove() {
		return approve;
	}

	public void setApprove(int approve) {
		this.approve = approve;
	}

	@Override
	public String toString() {
		return "FlowApprovalData [id=" + id + ", approval=" + approval + ", flowData=" + flowData + ", userName="
				+ userName + ", turn=" + turn + ", approve=" + approve + "]";
	}

    
}
