package fileio;

import java.io.Console;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = System.console();

		String inputString = console.readLine("Enter Your Name: ");

		System.out.println("The name entered: " + inputString);

	}

}
