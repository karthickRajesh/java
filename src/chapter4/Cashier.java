package chapter4;

import java.util.Scanner;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */
public class Cashier {

    public static void main(String[] args) {
     System.out.println("Eneter the number of Items ");
        Scanner scanner = new Scanner(System.in);
        int noOfItems = scanner.nextInt();
        double totalCost = 0;
        for (int i=0 ; i<noOfItems ; i++){

            System.out.println("Enter the cost of the item");
            double cost = scanner.nextDouble();

            totalCost = totalCost + cost;

        }
        scanner.close();

        System.out.println("Total Cost is Rs: " + totalCost);
    }
}
