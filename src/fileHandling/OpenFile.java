package fileHandling;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenFileUsingDesktop("/Users/karthick-9046/Downloads/searchtest1.txt");
	}
	
	private static void OpenFileUsingDesktop(String path) {
		
		File file = new File(path);
		
		boolean isDesktopSupported = Desktop.isDesktopSupported();
		System.out.println("isDesktopSupported is " + isDesktopSupported);
		
		if (isDesktopSupported) {
			Desktop desktop = Desktop.getDesktop();
			try {
				desktop.open(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
