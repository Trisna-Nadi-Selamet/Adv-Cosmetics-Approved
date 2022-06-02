package com.serverApp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;

import com.serverApp.models.FlowData;
import com.serverApp.models.UserData;
import com.serverApp.services.ApplicationService;
import com.serverApp.services.FlowDataService;

@RestController
@RequestMapping("/api/flow")
public class FlowDataController {

	@Autowired
    private FlowDataService flowDataService;

    @PostMapping
    public int create(@RequestBody FlowData flowData) {
        return flowDataService.insert(flowData);
    }

    @GetMapping
    public List<FlowData> findAll() {
        return flowDataService.findAll();
    }

    @GetMapping("/{id}")
    public FlowData findById(@PathVariable String id) {
        return flowDataService.findById(id);
    }

 
    @PutMapping
    public int update(@RequestBody FlowData flowData) {
        return flowDataService.update(flowData);
    }
}
