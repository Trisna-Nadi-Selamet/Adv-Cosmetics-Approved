package com.serverApp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serverApp.models.FlowApprovalData;
import com.serverApp.models.FlowData;
import com.serverApp.models.repos.FlowApprovalDataRepo;

@Service
@Transactional
public class FlowApprovalDataService {

	
	@Autowired
    private FlowApprovalDataRepo flowApprovalDataRepo;
	
	public int insert(FlowApprovalData flowApprovalData) {
		flowApprovalData.setId();
        return flowApprovalDataRepo.insert(flowApprovalData);
	}

	public List<FlowApprovalData> findAll() {
		
		return flowApprovalDataRepo.findAll();
	}

	public FlowApprovalData findById(String id) {
		 return flowApprovalDataRepo.findById(id);
	}

	public int update(FlowApprovalData flowApprovalData) {
		return flowApprovalDataRepo.update(flowApprovalData);
	}

}
