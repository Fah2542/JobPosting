package com.example.nvc.it.job_posting_collection.model;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter @NoArgsConstructor
public class Applicant {
    private String user_id;
    private String user_name;
    private String msg;
    private String regis_status;
    private String reply_msg;
    private Date regis_date;
}
