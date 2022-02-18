package com.example.nvc.it.job_posting_collection.repository;

import com.example.nvc.it.job_posting_collection.model.JobPosting;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobPostingRepository extends MongoRepository<JobPosting,String> {
    


}
