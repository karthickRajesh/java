package practice;

public class ReverseArrays {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int[] revNumbers = reverseArray(numbers);
        System.out.println();
        System.out.println( "Reverse array");

        for (int num: revNumbers){
                System.out.print( num);
            }

    }
    public static int[] reverseArray(int[] numbers ){
        System.out.println( "Actual array");
        for (int num: numbers){
            System.out.print( num);
        }
        int[] revNumbers = new int[numbers.length];
        int j = 0;
            for (int i=revNumbers.length-1 ; i>=0 ;i--){
                revNumbers[j] = numbers[i];
                j++;
            }
    return revNumbers;
    }
}
