package practice;

public class IsPalindrome {

    public static void main(String[] args) {

        isPalindrome("Welcome");
        isPalindrome("madam");

    }
    public static String reverse(String toBeChecked){
StringBuilder builder = new StringBuilder();

for (int i=toBeChecked.length()-1 ; i>=0 ; i--){
    builder.append(toBeChecked.charAt(i));
}
        return builder.toString();
    }

    public static void isPalindrome(String toBeChecked){
        boolean ispalindrome = false;
        if (toBeChecked.equals(reverse(toBeChecked))){
            ispalindrome = true;
            System.out.println(toBeChecked +" is a Palindrome");
        }else {
            System.out.println(toBeChecked + " is not a Palindrome");
        }
    }
}
