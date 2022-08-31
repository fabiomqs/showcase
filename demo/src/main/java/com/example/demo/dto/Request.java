package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {

    @JsonProperty("applicant")
    private Applicant applicant;
    @JsonProperty("get_person_token")
    private int getPersonToken;
    @JsonProperty("enqueue")
    private boolean enqueue;
    @JsonProperty("job")
    private Job job;
    @JsonProperty("partner_attributes")
    private PartnerAttributes partnerAttributes;

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public int getGetPersonToken() {
        return getPersonToken;
    }

    public void setGetPersonToken(int getPersonToken) {
        this.getPersonToken = getPersonToken;
    }

    public boolean isEnqueue() {
        return enqueue;
    }

    public void setEnqueue(boolean enqueue) {
        this.enqueue = enqueue;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public PartnerAttributes getPartnerAttributes() {
        return partnerAttributes;
    }

    public void setPartnerAttributes(PartnerAttributes partnerAttributes) {
        this.partnerAttributes = partnerAttributes;
    }
}
