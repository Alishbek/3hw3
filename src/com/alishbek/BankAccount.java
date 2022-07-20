package com.alishbek;

public class BankAccount {
    public BankAccount(double amount) {
        this.amount = amount;
    }

    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount=amount+sum;
    }
    public void withDraw(double sum) throws LimitException{
        if (amount<sum){
            throw new LimitException("Вы не можете снять больше денег, чем у вас на счету. Ваше счет ", getAmount());
        }
        amount=amount-sum;
    }
}
