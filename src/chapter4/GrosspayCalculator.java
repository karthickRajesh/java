package chapter4;
/*
Each employee makes 15 an hour
calculate pay based on no ohf hours worked
No overtime Aloowed

 */

import java.util.Scanner;

public class GrosspayCalculator {

    public static void main(String[] args) {

        int rate = 15;
        int maxHours = 40;

        System.out.println("Enter the number of Hours Worked");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        while (hoursWorked>maxHours || hoursWorked<0){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextInt();
        }
        scanner.close();
        int grossPay = hoursWorked * rate;
        System.out.println("Your Gross Pay is Rs:" + grossPay);

    }
}
