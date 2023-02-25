package model.entities;

import model.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){}
    public Account(Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Double getwithdrawLimit() {
        return withdrawLimit;
    }
    public void setwithdrawLimit(Double withdrawLimit){
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        balance += balance + amount;
    }
    public void withdraw(Double amount) throws DomainException{
        if (amount > balance){
            throw new DomainException("\nNot enough balance!");
        }
        if (amount > withdrawLimit){
            throw new DomainException("\nThe amount exceeds withdraw limit!");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "\nNew balance: "+String.format("%.2f",getBalance());
    }
}