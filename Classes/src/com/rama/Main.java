package com.rama;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        BankAccount bobsAccount = new BankAccount("1234", 0.0,"Ramiro Castro","ramiro@test","123456");
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(13);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100);
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getCustomerName());
    }
}