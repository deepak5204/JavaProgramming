package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteInFile {

	public static void main(String[] args) {
		try {
			FileWriter fileWrite = new FileWriter("E:\\Tools\\HackerRank\\src\\fileHandling\\hello.txt");
			fileWrite.write("This is my first file in java throughout the whole journey in programming till now.");
			fileWrite.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
