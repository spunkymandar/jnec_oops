//demo3
package fileio;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Readlines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path filePath = Path.of("textFile.txt");
		StringBuilder contentBuilder = new StringBuilder();
		
		try (Stream<String> stream = Files.lines(filePath)) {

		  stream.forEach(s -> contentBuilder.append(s).append("\n"));
		} catch (IOException e) {
		  //handle exception
		}
		System.out.println(contentBuilder.toString());
	}

}
