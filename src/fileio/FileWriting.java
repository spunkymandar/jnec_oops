package fileio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
//demo6
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String content = "some text";
		Path p=Paths.get("textfile1.txt");
				
		// Java 11
		Files.writeString(p, content);    

		// Using Files class
		Files.write(Path.of("textFile2.txt"), content.getBytes());   

		// Using BufferedWriter
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("textFile2.txt"))) {  
		  writer.write(content);
		}

		// Using FileWriter
		try(FileWriter fileWriter = new FileWriter(Path.of("textFile3.txt").toFile())){
		  fileWriter.write(content);
		}

		// Write to binary file
		try(FileOutputStream outputStream = new FileOutputStream(Path.of("textFile4.txt").toFile())){
		  byte[] strToBytes = content.getBytes();
		  outputStream.write(strToBytes);
		}
		System.out.println("Completed!");
	}

}
