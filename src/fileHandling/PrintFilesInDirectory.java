package fileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFilesInDirectory {

	public static void main(String[] args) {
		
		printFilesInDirectory("/Users/karthick-9046/Downloads");

	}
	
	public static void printFilesInDirectory(String path) {
		
		File directory = new File(path);
		
		File[] fileList = directory.listFiles();
		
		Arrays.sort(fileList);
		
		for (File file : fileList) {
			
			if (file.isDirectory()) {
				System.out.println("Directory Name is :" + file.getName() + " and Path is " + file.getAbsolutePath());

			}else if (file.isFile()) {
				System.out.println("File Name is :" + file.getName() + " and Path is " + file.getAbsolutePath());

			} else {
				System.out.println("Type Unknown Name is :" + file.getName() + " and Path is " + file.getAbsolutePath());

			}
			
		}
		
	}

}
