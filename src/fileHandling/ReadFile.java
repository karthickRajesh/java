package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// readFileUsingFileInputStream("/Users/karthick-9046/Downloads/searchtest1.txt");
		// readFileUsingFileBufferedReader("/Users/karthick-9046/Downloads/searchtest1.txt");
		//readFileUsingFileReader("/Users/karthick-9046/Downloads/searchtest1.txt");
		//readFileUsingScanner("/Users/karthick-9046/Downloads/searchtest1.txt");
		readFileUsingNIO("/Users/karthick-9046/Downloads/searchtest1.txt");

		
	}

	public static File fileInitialization(String path) {

		File file = new File(path);
		return file;

	}

	public static void readFileUsingFileInputStream(String path) {
		File file = fileInitialization(path);
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);

			int character = 0;
			try {
				while ((character = inputStream.read()) != -1) {
					System.out.print((char) character);

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void readFileUsingFileBufferedReader(String path) {

		File file = new File(path);
		BufferedReader bufferedReader = null;

		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			int character = 0;
			while ((character = bufferedReader.read()) != -1) {
				System.out.print((char) character);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void readFileUsingFileReader(String path) {

		FileReader fileReader = null;

		try {
			fileReader = new FileReader(path);
			int character = 0;
			while ((character = fileReader.read()) != -1) {
				System.out.print((char) character);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void readFileUsingScanner(String path) {
		File file = fileInitialization(path);

		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void readFileUsingNIO(String path) {
		try {
			List<String> strings = Files.readAllLines(Paths.get(path) , StandardCharsets.UTF_8);
			Iterator iterator = strings.iterator();
			
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
