package com.workintech.model;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = this.price;
        System.out.println("Hamburger: " + this.name + " on a " + this.breadRollType + " roll, with " + this.meat + ", price is " + this.price);

        if (addition1Name != null) {
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
            totalPrice += this.addition1Price;
        }
        if (addition2Name != null) {
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
            totalPrice += this.addition2Price;
        }
        if (addition3Name != null) {
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
            totalPrice += this.addition3Price;
        }
        if (addition4Name != null) {
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
            totalPrice += this.addition4Price;
        }

        System.out.println("Total price is " + totalPrice);
        return totalPrice;
    }
}
