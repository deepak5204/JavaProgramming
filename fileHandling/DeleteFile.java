package fileHandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File  myFile = new File("E:\\Tools\\HackerRank\\src\\fileHandling\\hello.txt"); 
		boolean result = myFile.delete();
		if(result) {
			System.out.print(myFile +" Syccessfully deleted");
		}
		
		
	}

}
