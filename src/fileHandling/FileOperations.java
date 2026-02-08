package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) {
		
		File file = new File("/Users/karthick-9046/Downloads/sample.txt");
		createFile(file);
		isFileExists(file);
		writeFile(file, "This is a Sample text");
		readFile(file);
		
		File newfile = new File("/Users/karthick-9046/Downloads/renamedSample.txt");
		
		renameFile(file, newfile);
		deleteFile(newfile);
	}

	private static void createFile(File file) {
	
			if (!isFileExists(file)) {
				try {
					file.createNewFile();
					System.out.println(" File Successfully created");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
					System.out.println("File Already Exists");
			}
		
	}
	
	public static boolean isFileExists(File file) {
		System.out.println("Do file exists :" + file.exists());
		return file.exists();
	}

	public static void writeFile(File file, String message) {
		
		if (isFileExists(file)) {
			try(FileWriter writer = new FileWriter(file);) {
				writer.write(message);
				System.out.println("File is successsfully written");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("File is not written");
			}
		} else {
			System.out.println("File is not present");
		}
		
	}

	public static void readFile(File file) {
		
		if (isFileExists(file)) {
			try(Scanner scanner = new Scanner(file)) {
					
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
					
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("File not printed");
			}
			
		} else {
			System.out.println("File not found");
		}
	}

	public static void renameFile(File oldfile , File newFile) {
		
		if (isFileExists(oldfile)) {
			oldfile.renameTo(newFile);
			System.out.println(" File is Renamed");
			
		}else {
			System.out.println("File is not Renamed");
		}
	}
	
	public static void deleteFile(File file) {
		
		if (isFileExists(file)) {
			file.delete();
			System.out.println("File is Deleted");
		} else {
			System.out.println("File is not Deleted");
		}
	}
	
}
