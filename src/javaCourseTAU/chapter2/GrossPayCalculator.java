package javaCourseTAU.chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main (String[] args){
        //Get No of Hours
        System.out.println("Enter The Number of Hours the Employee Worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //Get Rate for an Hour
        System.out.println("Enter the Hourly rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //Multiply Both
        double wage = rate * hours;
        //Display result
        System.out.println("The Wage for the employee is $" + wage);

    }
}
