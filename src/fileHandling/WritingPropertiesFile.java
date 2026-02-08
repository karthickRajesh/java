package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingPropertiesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		prop.put("name","Karthick Rajesh");
		prop.put("Experience", "8");
		prop.put("Position", "QA");
		
		writeProperties(prop, "/Users/karthick-9046/git/java/src/TestData/sample.txt");

	}
	
	public static void writeProperties(Properties prop, String filePath) {
		
		try(FileOutputStream outputStream = new FileOutputStream(filePath)) {
			prop.store(outputStream, "Properties should be updated");
			System.out.println("Properties are updated");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
