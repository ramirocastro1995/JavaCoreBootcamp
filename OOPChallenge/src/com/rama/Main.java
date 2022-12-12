package com.rama;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.26);
        hamburger.addHamburgerAddition2("Lettuce",0.21);
        hamburger.addHamburgerAddition3("Chesse",0.27);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.87);
        healthyBurger.addHamburgerAddition1("egg", 5.34);
        healthyBurger.addHealthAddition1("Lentils", 3.14);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("Shoud not do this",13.4);
        db.itemizeHamburger();
    }
}