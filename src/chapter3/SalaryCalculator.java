package chapter3;
/*
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        int salary = 1000;
        int bonus = 250;
        int target = 10;

        System.out.println("Enter the no of Sales:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if (sales > target){
            salary = salary +bonus;
        }
        System.out.println("Your Salary is: " + salary);

    }

}
