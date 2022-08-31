package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Applicant {

    @JsonProperty("email")
    private String email;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
//    @JsonProperty("resume")
//    private Resume resume;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    public Resume getResume() {
//        return resume;
//    }
//
//    public void setResume(Resume resume) {
//        this.resume = resume;
//    }
}
