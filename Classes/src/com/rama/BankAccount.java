package com.rama;
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("1234",2.50,"default name","default email","default number");
        System.out.println("Empty creator called");
    }
    public BankAccount(String accountNumber, double balance,String customerName, String email, String phoneNumber){
        System.out.println("Empty with param called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999",100.55,customerName);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("deposit of "+ depositAmount + " new balance " + this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("only " + this.balance + " available.Withdrawal not processed");
        } else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

