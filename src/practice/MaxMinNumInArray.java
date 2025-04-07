package practice;

public class MaxMinNumInArray {
    //Write a method that will accept an array of int as an argument and it returns the max/min number from a given array.

    public static void main(String[] args) {

        int[] numbers = {567, 789, 767,678, 343,2,222};
        maxMinNumInArray(numbers);
    }
    public static void maxMinNumInArray(int[] numbers){

        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int number : numbers){
            if (number>maximum){
                maximum = number;
            }else if (number<minimum){
                minimum=number;
            }
        }
        System.out.println("Maximum Number in Array is " + maximum);
        System.out.println("Minimum Number in Array is " + minimum);

    }
}
