package practice;

public class ReverseWordsInString {

    public static void main(String[] args) {

        String toBeReversed = "love is India";
        String[] words = toBeReversed.split(" ");

        StringBuilder builder = new StringBuilder();
        for (int i=words.length-1 ; i>= 0 ;i-- ){
            builder.append(words[i]+ " ");
        }
        System.out.println(builder);

    }
}
