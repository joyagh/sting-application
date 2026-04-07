package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String itemName = "matcha";
        double itemPrice = 5.21;

        int quantity = 2;
        System.out.println("You bought " + quantity + " " + itemName + " for $" + itemPrice + ".");
    }
}
