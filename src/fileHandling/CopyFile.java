package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		
		copyFileUsingStreams("/Users/karthick-9046/Downloads/searchtest.txt", "/Users/karthick-9046/Downloads/searchtest1.txt");
	}
	
	public static void copyFileUsingStreams(String oldFilePath, String newFilePath) {
		
		FileInputStream inputStream = null;
		FileOutputStream outputStream =null;
				try {
					 inputStream = new FileInputStream(oldFilePath);
					 outputStream = new FileOutputStream(newFilePath);
					
					System.out.println(inputStream.available());
					
					inputStream.transferTo(outputStream);
					
					System.out.println(outputStream.toString());
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					
					try {
						inputStream.close();
						outputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
	}

}
