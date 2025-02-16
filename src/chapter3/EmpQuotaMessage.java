package chapter3;

import java.util.Scanner;

/*
All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */
public class EmpQuotaMessage {

    public static void main(String[] args) {
        int target = 10;

        System.out.println("Enter the number of sales done");
        Scanner scanner = new Scanner(System.in);
        int sales =  scanner.nextInt();
        scanner.close();

        if (sales >= target) {
            System.out.println("Congratulations Yoy Have Completed the Target");
        } else {
            int shortBy = target-sales;
            System.out.println("You are still short of target by " + shortBy);
        }

    }
}
