//demo2
package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Readfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Path p=Paths.get("textfile1.txt");
		
		Path filePath = Path.of("textFile.txt");
		if(Files.exists(filePath)) {
			String content = Files.readString(filePath);
			System.out.println(content);
		}
		else {
			System.out.println("File not present");
		}
	}

}
