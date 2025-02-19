package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		try {
		File file=new File("src/activities/newfile.txt");
		boolean fStatus=file.createNewFile();
		if(fStatus) {
			System.out.println("File has been created successfully");
		}else {
			System.out.println("File already exists in this path");
		}
		//get the file Object
		File fileUtil = FileUtils.getFile("src/activities/newfile.txt");
		//Read file
		System.out.println("The data in the file is: " + FileUtils.readFileToString(fileUtil, "UTF8"));
		
		//Create directory
		File destDir = new File("resources");
		//Copy file to directory
		FileUtils.copyFileToDirectory(file, destDir);
		
		//Get file from new directory
		File newFile = FileUtils.getFile(destDir, "newfile.txt");
		//Read data from file
		String newFileData = FileUtils.readFileToString(newFile, "UTF8");
		
		//Print the data
		System.out.println("Data in the new file is: "+ newFileData);
		}catch(IOException eMessage) {
			System.out.println(eMessage);
		}
	}

}
