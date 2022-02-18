package com.example.nvc.it.job_posting_collection.controller;

import java.util.HashMap;
import java.util.List;

import com.example.nvc.it.job_posting_collection.model.JobPosting;
import com.example.nvc.it.job_posting_collection.service.JobPostingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobpost")
public class JobPostingController {
    
    @Autowired
    private JobPostingService jobPostingService;

    @GetMapping("")
    public ResponseEntity<Object> getAllJobPostings(){
        List<JobPosting> jobPostings = jobPostingService.getJobPostings();
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Search Success");
        map.put("data", jobPostings);
        return new ResponseEntity<Object>(map, HttpStatus.OK); 
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getCameraById(@PathVariable String id){
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Search Success");
        map.put("data", jobPostingService.getJobPostById(id));
        return new ResponseEntity<Object>(map, HttpStatus.OK); 
    }
    @PostMapping("")
    public ResponseEntity<Object> addCamera(@RequestBody JobPosting jobPosting){
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Post Success!");
        map.put("data", jobPostingService.addJobPost(jobPosting));
        return new ResponseEntity<Object>(map,HttpStatus.OK);
    };

}
