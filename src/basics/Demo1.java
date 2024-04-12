package basics;

import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("b.txt");
		if(f.exists()) {
			System.out.println("File is already present");
		}
		else {
		f.createNewFile();
		System.out.println("file is created!!");
		}
	}

}
