package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Job {

    @JsonProperty("jobId")
    private String jobId;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
}
