package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IsAnagram {


    public static void main(String[] args) {

        isAnagram("aab", "asd");
        isAnagram("abc", "cab");
    }

    public static void isAnagram(String string1, String string2){
        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1,charArray2)){
            System.out.println(string1 +" is anagram of "+ string2);
        }else {
            System.out.println(string1 +" is not anagram of "+ string2);

        }
    }
}
