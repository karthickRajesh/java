package exercises.chapter3;

import java.util.Scanner;

/*
user to enter the quantities for the 10,20,50 coins.
do is count up the value of all of the change that they answered.
declare winner if it matched 100
 */
public class ChangeForADollarGame {

    public static void main(String[] args) {

        int target = 100;
        System.out.println("Enter How many 10");
        Scanner scanner = new Scanner(System.in);
        int noOf10 = scanner.nextInt() * 10;

        System.out.println("Enter How many 20");
        int noOf20 = scanner.nextInt() * 20;

        System.out.println("Enter How many 50");
        int noOf50 = scanner.nextInt() * 50;
        scanner.close();
        int sum = noOf10 + noOf20 + noOf50;

        String message;

        if (target > sum) {
            message = "You have Short of Target by " + (target - sum);
        } else if (target < sum) {
            message = "You have excceded the Target by " + (sum - target);
        } else {
            message = "Congrats You Have Won The Game";
        }

        System.out.println(message);
    }
}
