package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVHandling {

	public static void main(String[] args) {

		String csvFile = System.getProperty("user.dir") + "/TestData/data.csv";
		csvWriter(csvFile);
		readCSVUsingScanner(csvFile);
		readCSVUsingBufferedReader(csvFile);
	}

	public static void csvWriter(String csvFile) {

		try (FileWriter writer = new FileWriter(csvFile)) {
			writer.append("Name, Age,Position \n");
			writer.append("Karthick, 30,QA \n");
			writer.append("Rajesh, 35,Devloper \n");
			writer.append("Swami, 67,Manager \n");

			System.out.println("Print CSV File " + csvFile);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readCSVUsingScanner(String csvFile) {

		
		try(Scanner scanner = new Scanner(new File(csvFile))) {
			
		
		scanner.useDelimiter(",");

		while (scanner.hasNext()) {
			System.out.print(scanner.next() + "\t");
			
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void readCSVUsingBufferedReader(String csvFile) {

		try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {

			String line ;

			while ((line = reader.readLine())!= null) {
				String[] content = line.split(",");
				for(String string : content) {
					System.out.print(string + "\t");
				}
				System.out.println();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
