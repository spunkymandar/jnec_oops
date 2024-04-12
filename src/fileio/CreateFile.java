//demo1
package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class CreateFile{
	public static void main(String[] args) throws IOException {
//		Path p=Paths.get("sample.txt");
//		Files.createFile(p);
//		System.out.println("File is created");
		String TEXT_FILE = "textFile.txt";

		Path textFilePath = Paths.get(TEXT_FILE);
		if (!Files.exists(textFilePath)) {
				Files.createFile(textFilePath);
				System.out.println("File created successfully");
		}
		else {
			System.out.println("File present already");
		}
	}
}
