package chapter4;

import java.util.Scanner;

public class AverageTestScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int students = scanner.nextInt();

        System.out.println("Enter the number of Tests");
        int tests = scanner.nextInt();

        double total = 0;
        for (int i=0; i< students ; i++){
            System.out.println("Student no " + i);
            for (int j=0 ; j< tests ;j++){
                System.out.println("Enter the Marks of Test " + j);
                int mark = scanner.nextInt();
                total = total + mark;

            }
            double average = total/tests;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }
        scanner.close();
    }
}
