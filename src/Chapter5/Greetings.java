package Chapter5;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        System.out.println("Enter Your Name :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        greetUser(name);
    }

    public static void greetUser (String name) {
        System.out.println("Hi , There " + name);
    }
}
