package fileio;

//demo5
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path filePath = Path.of("textFile.txt");
		String fileContent = "";
		StringBuilder contentBuilder = new StringBuilder();

		try (BufferedReader br = new BufferedReader(new FileReader("textFile.txt"))){
			String sCurrentLine;
		    while ((sCurrentLine = br.readLine()) != null) 
		    {
		        contentBuilder.append(sCurrentLine).append("\n");
		    }
		}
		catch(IOException ie) {
			 ie.printStackTrace();
		}
	
		fileContent = contentBuilder.toString();
		System.out.println(fileContent);
	}

}
