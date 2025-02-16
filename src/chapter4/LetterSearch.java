package chapter4;

import java.util.Scanner;

public class LetterSearch {
// * Search a String to determine if it contains the letter ‘A’.
    public static void main(String[] args) {

        System.out.println("Enter A String:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean  letterFound = false;
        int i;
        for ( i=0; i < text.length();i++){
            char currentLetter = text.charAt(i);

            if (currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }

        }
        if(letterFound){
            System.out.println("This text contains the letter 'A' at " + i);
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}
