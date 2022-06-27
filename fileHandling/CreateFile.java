package fileHandling;

import java.util.*;
import java.io.File;
import java.io.IOException;

public class CreateFile {


	public static void main(String[] args) {
		File myFile = new File("E:\\Tools\\HackerRank\\src\\fileHandling\\hello2.txt");
		boolean result;
		try {
			result = myFile.createNewFile();//create a filename with hello.txt
			if(result)
			System.out.print("Successfully created a file");
		}catch(IOException e) {
			System.out.println("Unable to create this file");
			e.printStackTrace();
		}
	}

}


