//demo9
package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("myDir"); 

		if (!Files.exists(path)) {
		  Files.createDirectory(path);
		  System.out.println("Directory created");
		}
		else {
			System.out.println("Directory already present");
		}

	}

}
