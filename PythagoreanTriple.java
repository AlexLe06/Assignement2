package org.example;

/**
 * @ Le Nguyen Tan Alex
 */
public class PythagoreanTriple {
    public static void main(String[] args) {
        System.out.printf("%s %8s %12s\n", "Side 1", "Side 2", "Hypotenuse");

        for (int side1 = 1; side1 <= 500; side1++){
            for (int side2 = 1; side2 <= 500; side2++){
                for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++){
                    if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(hypotenuse, 2))
                        System.out.printf("%-8s %-8s %s\n" , side1 ,side2 ,hypotenuse);

                }
            }
        }
    }
}