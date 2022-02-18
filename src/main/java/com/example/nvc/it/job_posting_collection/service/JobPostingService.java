package com.example.nvc.it.job_posting_collection.service;

import java.util.List;
import java.util.Optional;

import com.example.nvc.it.job_posting_collection.model.JobPosting;
import com.example.nvc.it.job_posting_collection.repository.JobPostingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobPostingService {
    
    @Autowired
    private JobPostingRepository jobPostingRepository;

    public List<JobPosting> getJobPostings(){
        return jobPostingRepository.findAll();
    }

    public Optional<JobPosting> getJobPostById(String id){
        return jobPostingRepository.findById(id);
    }

    public JobPosting addJobPost(JobPosting jobPosting){
        return jobPostingRepository.save(jobPosting);
    }

}
