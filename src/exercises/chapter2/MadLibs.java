package exercises.chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        //get Adjective from an User
        System.out.println("Kindly enter an ADJECTIVE ");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.nextLine();

        // get a Season from the User
        System.out.println("Kindly enter an SEASON ");
        String season = scanner.nextLine();
        scanner.close();
        //get an whole number
        System.out.println("Kindly enter aN WHOLE NUMBER ");
        int number = scanner.nextInt();

        // Display result
        System.out.println("on a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee");

    }
}
