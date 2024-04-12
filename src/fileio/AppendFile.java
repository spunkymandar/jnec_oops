//demo7
package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppendFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String textToAppend = "We are learning file IO";

		Path path = Paths.get("textFile.txt");

		Files.write(path, textToAppend.getBytes(), StandardOpenOption.APPEND); 
		System.out.println("File appended");

	}

}
