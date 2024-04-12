package fileio;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter {

	public static void main(String[] args) {
	
		File File_Directory = new File("temp");

	    // check if the directory is valid directory
	    if (!(File_Directory.exists() && File_Directory.isDirectory())) {
	      System.out.println(String.format("This Directory does not exist", File_Directory));
	      return;
	    }

//	    FileFilter Demo_Filefilter = new FileFilter() {
//	      public boolean accept(File Demo_File) {
//	        if (Demo_File.getName().endsWith(".txt")) {
//	          return true;
//	        }
//	        return false;
//	      }
//	    };

	    File[] Text_Files = File_Directory.listFiles(new FilterClass());
	    //File_Directory.listFiles(new FilterClass());

	    for (File Demo_File : Text_Files) {
	      System.out.println(Demo_File.getName());
	    }
	  }
	}

class FilterClass implements java.io.FileFilter{
	public boolean accept(File Demo_File) {
        if (Demo_File.getName().endsWith(".log")) {
          return true;
        }
        return false;
      }
}

