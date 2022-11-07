package com.rama;

public class Main {
    public static void main(String[] args) {
        /*Car porsche = new Car();
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

        BankAccount timsAccount = new BankAccount("Tim","tim@test","123456");
        System.out.println(timsAccount.getAccountNumber()+ " name " + timsAccount.getCustomerName());*/

        VipCustomer customerTim = new VipCustomer();
        System.out.println(customerTim.getName());

        VipCustomer customerTwo = new VipCustomer("bob", 200.00);
        System.out.println(customerTwo.getName());

        VipCustomer customerThree = new VipCustomer("Tim", 3000.00, "tim@aaa.co");
        System.out.println(customerThree.getEmailAddress());
        System.out.println(customerThree.getName());
    }
}