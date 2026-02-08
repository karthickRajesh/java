package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * Will be Creating FIle using
 * 			FIle
 * 			FileOutSTream
 * 			Java NIO utils
 */
public class CreateFile {

	public static void main(String[] args) {

		//createFIleusingFIle("/Users/karthick-9046/Downloads/filecreation.txt");
		//createFileUsingFileOutputStream("This is Sparta", "/Users/karthick-9046/Downloads/filecreationfos.txt");
		createFileUsingNIO("/Users/karthick-9046/Downloads/filecreationNIO.txt");
		
	}
	
	public static void createFIleusingFIle(String path) {
		
		File file = new File(path);
		
		try {
			boolean isFileCreated = file.createNewFile();
			System.out.println("isFileCreated is " + isFileCreated);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public static void createFileUsingFileOutputStream(String Content,String path) {
		
		try {
			FileOutputStream outputStream = new FileOutputStream(path);
			outputStream.write(Content.getBytes());
			outputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void createFileUsingNIO(String path) {
		
		Path pathLocation = Paths.get(path);
		try {
			Path newPath =Files.createFile(pathLocation);
			System.out.println("new file created at : " + newPath);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
}
