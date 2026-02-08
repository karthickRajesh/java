package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomException {

	public static void main(String[] args) throws IOException {
		checkCustomExceptionWithAUtomaticResourceClosingandSupressingException();
	}
	
	public static void checkCustomExceptionWithAUtomaticResourceClosingandSupressingException() throws IOException {
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter the Number ");
			
			int num = Integer.parseInt(reader.readLine());
			
			if (num<10) {
				throw new MyException("Custom Exception thrown");
			}
			
		} catch (MyException e) {
			System.out.println("Custom exception Worked" + e);
		} catch (Exception e) {
			System.out.println(" other exception" + e);
		}
		
	}
	

	static class MyException extends Exception{

		public MyException(String message) {
			super(message);
		}
		
		
	}
	

}