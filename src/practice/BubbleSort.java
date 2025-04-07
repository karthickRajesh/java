package practice;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {45,34,67,23,12,478,1};

        for (int i=0 ; i<numbers.length-1; i++){
            for (int j=0; j<numbers.length-1; j++){

                if (numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }

            }
        }

        for (int i=0 ; i<numbers.length-1; i++){
            System.out.print(numbers[i] + " ");
        }

    }
}
