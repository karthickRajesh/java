package fileHandling;

import java.io.File;

public class FolderOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("/Users/karthick-9046/Downloads/TempFolder");
		createFolder(file);
		isFolderExists(file);
		
		File newFile = new File("/Users/karthick-9046/Downloads/TempFolder");
		renameFile(file, newFile);
		deleteFolder(newFile);
		
	}

	public static void createFolder(File file) {

		if (!isFolderExists(file)) {
			file.mkdir();
			System.out.println("Folder is Created");
		} else {
			System.out.println("Folder Already exist");
		}

	}

	public static boolean isFolderExists(File file) {

		if (file.exists()) {
			System.out.println("Folder Exists");
			return true;
		} else {
			System.out.println("Folder do not Exists");
			return false;

		}
	}

	public static void renameFile(File oldFile , File newFile) {
		
		if (isFolderExists(oldFile)) {
				oldFile.renameTo(newFile);
				System.out.println(" File is Renamed");
		} else {
			System.out.println("File not Present");
		}
		
	}
	
	public static File[] listFolderFiles(File file) {
		File[] fileList = null;
		if (isFolderExists(file)) {
			fileList = file.listFiles();
			return fileList;
		}
		return fileList ;
		
	}
	
	public static void deleteFolder(File file) {
		
		if (isFolderExists(file)) {
			for(File f: listFolderFiles(file)) {
				f.delete();
			}
			file.delete();
			System.out.println(" Folder Deleted");
		}else {
			System.out.println("Folder not Deleted");
		}
	}
	
}
