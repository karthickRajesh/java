package exceptionHandling;

public class ArithmaticException {

	public static void main(String[] args) {
		
		System.out.println(divideNumbers(8,4));
		System.out.println(divideNumbers(4,8));
		System.out.println(divideNumbers(8,0));
	}
	
	public static int divideNumbers(int i,int j) {
		
		int k=0;
		
		try {
		k = i/j;
		}catch (Exception e) {
			System.out.println("Cannot divide by zero");
		}
		return k;
		
	
		
	}
}
