package practice;

public class ReverseString {

    public static void main(String[] args) {
        /*
        get String
        loop and get char
        put in reverse using string builder
         */

        String toBeReversed = "to be continued";
        StringBuilder builder = new StringBuilder();

        for (int i=toBeReversed.length()-1; i>=0; i--){
           // System.out.println(toBeReversed.charAt(i));
            builder.append(toBeReversed.charAt(i));

        }
        System.out.println(builder);
    }
}
