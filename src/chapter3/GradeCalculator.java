package chapter3;

import java.util.Scanner;

// * Display the letter grade for a student based on their test score.
public class GradeCalculator {

    public static void main(String[] args) {

        System.out.println("Enter the Marks Obtained by User");
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        scanner.close();
        char grade;
        if (mark < 60){
            grade = 'F';
        }else if (mark< 70){
            grade = 'D';
        }else if (mark < 80){
            grade = 'C';
        }else if (mark < 90){
            grade = 'B';
        } else{
            grade = 'A';
        }

        if (mark >100){
            System.out.println("Mark Entered is Invalid" );

        } else{
            System.out.println("The Grade of The Student is " + grade);

        }

    }
}
