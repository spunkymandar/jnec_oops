//demo4
package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadBytes {
	public static void main(String[] args) {
		Path filePath = Path.of("textFile.txt");
		String fileContent = "";

		try {

		    byte[] bytes = Files.readAllBytes(filePath);
		    fileContent = new String (bytes);
		} catch (IOException e) {
		    //handle exception
		}
		System.out.println(fileContent);
	}

}
