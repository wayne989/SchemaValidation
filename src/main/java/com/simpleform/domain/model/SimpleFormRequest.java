package com.simpleform.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleFormRequest {
    @JsonProperty("bankInfo")
    BankingInfo bankInfo;
    @JsonProperty("email")
    String email;
    @JsonProperty("phone")
    String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BankingInfo getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(BankingInfo bankInfo) {
        this.bankInfo = bankInfo;
    }

}
