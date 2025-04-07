package practice;

public class IsPalindromeNumber {

    public static void main(String[] args) {

        int[] numbers = {567, 789, 767,678, 343,0,222};

        for (int number : numbers){
            System.out.println(number + " is " + isPalindrome(number));
        }
    }

    public static boolean isPalindrome(int number){

        int original = number;
        int reversed = 0;

        while (number>0){
            int digit = number%10;
            reversed = reversed*10 + digit;
            number = number/10;

        }

        return original==reversed;
    }
}
