package practice;

public class SecondLargestinArray {
    public static void main(String[] args) {

        int[] numbers = {23,45,34,56,87,2,66,77};

        System.out.println(findSecondlargest(numbers));
    }

    public static int findSecondlargest(int[] numbers){

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest){
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i]> secondLargest && numbers[i]!=largest){
                secondLargest = numbers[i];

            }
        }

        return secondLargest;
    }
}
