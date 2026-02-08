package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling {

	public static void main(String[] args) {

		getArrayandDivide(1, 3);
		getArrayandDivide(1, 4);

	}

	public static void getArrayandDivide(int index, int arraylength) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number");

		int[] array = new int[arraylength];
		int k = 0;

		try {
			int divby = Integer.parseInt(reader.readLine());

			for (int i = 0; i <= arraylength; i++) {
				array[i] = i * 2;
				System.out.print(i + " ");

				if (i == index) {
					k = array[index] / divby;
				}
			}

		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("Cannot divide ny zer0");
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of Bound");
		} catch (IOException e) {
			System.out.println("IO Exception " + e);
			e.printStackTrace();
		} finally {

			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
