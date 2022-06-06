package com.serverApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.serverApp.models.FlowApprovalData;
import com.serverApp.services.FlowApprovalDataService;


@RestController
@RequestMapping("/api/approval")
public class FlowApprovalDataController {

	@Autowired
    private FlowApprovalDataService flowApprovalDataService;

    @PostMapping
    public int create(@RequestBody FlowApprovalData flowApprovalData) {
        return flowApprovalDataService.insert(flowApprovalData);
    }

    @GetMapping
    public List<FlowApprovalData> findAll() {
        return flowApprovalDataService.findAll();
    }

    @GetMapping("/{id}")
    public FlowApprovalData findById(@PathVariable String id) {
        return flowApprovalDataService.findById(id);
    }

 
    @PutMapping
    public int update(@RequestBody FlowApprovalData flowApprovalData) {
        return flowApprovalDataService.update(flowApprovalData);
    }
	
}
