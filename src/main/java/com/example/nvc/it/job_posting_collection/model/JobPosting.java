package com.example.nvc.it.job_posting_collection.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @Document("cameras")

@Document("jopposting")
@Getter @Setter @NoArgsConstructor
public class JobPosting {
    @Id
    private String  _id;
    private String company_id;
    private String company_name;
    private String  title;
    private String description;
    private List<String> department = new ArrayList<String>();
    private Integer max_salary;
    private Integer min_salary;
    private Integer max_age;
    private Integer min_age;
    private Date start_date;
    private Date end_date;

    private List<Applicant> applicants = new ArrayList<Applicant>();

}
