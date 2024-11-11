package org.example;

import java.util.Scanner;

/**
 * @ Le Nguyen Tan Alex
 */
public class ProductSold {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product number (1-5 or 0 to stop): ");
        int productNum = input.nextInt(); //Initial value of product to start loop
        double price = 0; // Initial value is 0 then it updates in the loop

        while (productNum != 0) {
            System.out.println("Enter quantity: ");
            int quantitySold = input.nextInt(); //Input quantity

            //Calculates price for each product
            switch (productNum) {
                case 1 -> {
                    price = 2.50 * quantitySold;
                }
                case 2 -> {
                    price = 4.50 * quantitySold;
                }
                case 3 -> {
                    price = 9.98 * quantitySold;
                }
                case 4 ->  {
                    price = 4.49 * quantitySold;
                }
                case 5 ->  {
                    price = 6.87 * quantitySold;
                }
                default -> System.out.println("Please print a number between 1 and 5");
            }

            double priceUpdate = price; //Updates the price in the loop for the next line of code
            price = price + priceUpdate; //Takes the price from all loop iterated and additions the new price

            System.out.println("Enter product number (1-5 or 0 to stop): ");
            productNum = input.nextInt(); //Input the new product number

            if (productNum == 0) //Stops if 0
                break;
        }
        System.out.print("Total retail value of all products sold is: $" + price);
    }
}