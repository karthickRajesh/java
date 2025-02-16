package chapter3;

import java.util.Scanner;

/*
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessage {

    public static void main(String[] args) {
    System.out.println("Enter the Grade of the Student");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message ;
        switch (grade){
            case "A":
            message = "Excellent Score";
            break;
            case "B":
                message = "Great Score";
                break;
            case "C":
                message = "Good Score";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Sorry you have Failed";
                break;
            default:
                message = "Invalid Grade";
        }

        System.out.println("Old Switch Case" + message);

         message = switch (grade){
            case "A" -> "Excellent Score";
            case "B" -> "Great Job";
            case "C" -> "Good Job";
            case "D" -> "Need to Work Hard";
            case "F" -> "You have Failed";
            default -> "Invalid grade";
        };
        System.out.println("New Switch Case" + message);


    }
}
