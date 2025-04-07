package practice;

public class ReverseStringNotPosition {

    public static void main(String[] args) {
        /*
        get string
        split words with space
        for loop to reverse
         */

        String toBeReversed = "we Love India";
        String[] words = toBeReversed.split(" ");
        StringBuilder builder = new StringBuilder();

        for (String word :  words){
            builder.append(reverseString(word) + " ");
        }
        System.out.println(builder);

    }

    public static String reverseString(String toBeReversed){
        StringBuilder builder = new StringBuilder();

        for (int i=toBeReversed.length()-1; i>=0; i--){
            builder.append(toBeReversed.charAt(i));
        }
        return builder.toString();
    }
}
