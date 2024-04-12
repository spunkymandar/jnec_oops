//demo8
package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TempFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path tempFile = Files.createTempFile("test-data-", ".txt"); //NIO
		//tempFile.toFile().deleteOnExit();
		System.out.println("temporary file created");

	}

}
