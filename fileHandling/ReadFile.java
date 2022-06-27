package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
	public static void main(String[] args) {
		File file = new File("E:\\Tools\\HackerRank\\src\\fileHandling\\hello.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
