package org.example;

import java.util.Scanner;

/**
 * @ Le Nguyen Tan Alex
 */

public class WorldPopulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the world population calculator");
        System.out.println("Enter the current world population: ");
        long population = input.nextLong(); //Input the population
        System.out.println("Enter the current growth rate (e.g, 1.14% would be .0114): ");
        double growthRate = input.nextDouble(); //Input growth rate

        System.out.printf("%s | %s | %s \n" , "Year",
                "Estimated Population", "Change from prior Year");

        for (int year = 1; year <= 75; year++){
            long estimatedPop = (long)(population * (1 + growthRate)); //Calculates estimated population
            System.out.printf("%4d %22d %24d\n" , year, estimatedPop , estimatedPop - population);
            population = estimatedPop; //Updates the current population to the year when loops restarts

        }
    }
}
//Do not put population or else it resets to the original population *note for myself*
//Iterates the same thing