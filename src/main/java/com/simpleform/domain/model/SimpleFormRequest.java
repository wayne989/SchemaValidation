package com.simpleform.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleFormRequest {
    @JsonProperty("bankInfo")
    BankingInfo bankingInfo;
    @JsonProperty("email")
    String email;
    @JsonProperty("phone")
    String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BankingInfo getBankingInfo() {
        return bankingInfo;
    }

    public void setBankingInfo(BankingInfo bankingInfo) {
        this.bankingInfo = bankingInfo;
    }

}
