package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Info {

    @JsonProperty("person_id")
    private int personId;
    @JsonProperty("bearer_token")
    private String bearerToken;
    @JsonProperty("job_id")
    private String jobId;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getBearerToken() {
        return bearerToken;
    }

    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
}
