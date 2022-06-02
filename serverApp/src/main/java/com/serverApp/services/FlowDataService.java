package com.serverApp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serverApp.models.FlowData;
import com.serverApp.models.repos.FlowDataRepo;

@Service
@Transactional
public class FlowDataService {

	@Autowired
    private FlowDataRepo flowDataRepo;
	
	
	public List <FlowData>findAll(){
        return flowDataRepo.findAll();
    }
	
	
	public FlowData findById(String id) {
        return flowDataRepo.findById(id);
    }

    public int insert(FlowData flowData) {
    	flowData.setId();
        return flowDataRepo.insert(flowData);
    }


	public int update(FlowData flowdata) {
		return flowDataRepo.update(flowdata);
	}

}
	
	
	
	
	


