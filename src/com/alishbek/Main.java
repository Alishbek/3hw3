package com.alishbek;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount bankAccount = new BankAccount(0);
        bankAccount.deposit(20000);
        while (true){
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException limitException){
                limitException.getMessage();
                try {
                    bankAccount.withDraw(limitException.getRemainingAmount());
                }catch (LimitException limitException1){

                }
                if (bankAccount.getAmount()==0){
                    limitException.setRemainingAmount(0.0);
                }

                System.out.println(bankAccount.getAmount());
                System.out.println(limitException.getRemainingAmount());
                break;
            }

        }

    }
}
