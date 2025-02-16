package chapter4;

import java.util.Scanner;

/*
get two numbers and add
then ask if they need to add another two number
add if needed else stop
 */
public class AddNumberTillNeeded {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean nextSum;
        do {
            System.out.println("Enter The First number");
            int num1 = scanner.nextInt();

            System.out.println("Enter The Second Number");
            int num2 = scanner.nextInt();

            int total = num1 +num2;
            System.out.println("DTotal is : " + total);
            System.out.println("Do you Want to Execute Another if Yes type 'true' Else 'False'");
            nextSum = scanner.nextBoolean();
        } while (nextSum);
        scanner.close();
    }
}
