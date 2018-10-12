package com.simpleform.domain.model;

import java.math.BigInteger;

public class BankingInfo {
    public enum Bank{TD, RBC, BMO, SCOTIA, CIBC};
    public String accountHolderName;
    public Bank institution;
    public Integer transitNumber;
    public BigInteger accountNumber;
}
