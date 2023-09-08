package org.delazeri;

import java.math.BigDecimal;

public class BankAccount {

    private int number;
    private String agency;
    private String clientName;
    private BigDecimal balance;

    public BankAccount() {}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void printWelcomeMessage() {
        System.out.println("Hi " + clientName + ", thank you for create a account in our bank, your agency is " + agency  + ", account " + number  + " and your balance " + balance + " is already available to withdraw");
    }
}