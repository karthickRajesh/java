package practice;

public class IsPrimeNumber {
    public static void main(String[] args) {

        System.out.println(isPrime(32));
    }
    public static boolean isPrime(int num){
        boolean isPrime = true;
        if (num <= 1) {
            return false; // 0, 1, and negative numbers are not prime
        }
        for (int i=2 ; i<=num/2 ; i++){
            if (num%i==0) {
                isPrime = false;
                break;
            }

        }

        return isPrime;
    }
}
