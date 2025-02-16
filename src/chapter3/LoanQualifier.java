package chapter3;

import java.util.Scanner;

/*
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {

    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredEmploymentYears = 2;

        System.out.println("Kindly enter your Salary");
        Scanner scanner = new Scanner(System.in);
        double usersSalary = scanner.nextDouble();

        System.out.println("Kindly enter your Years of Employment");
        double usersEmploymentYears = scanner.nextDouble();
        scanner.close();
        if (requiredSalary <= usersSalary){
            if (requiredEmploymentYears <= usersEmploymentYears){
                System.out.println("Congratulations You are Qualified for Loan");
            } else {
                System.out.println("Sorry You must be employed here for a minimum of " + requiredEmploymentYears + " years");
            }
        }else {
            System.out.println("Sorry You salary must be atleast " + requiredSalary);

        }

    }
}
