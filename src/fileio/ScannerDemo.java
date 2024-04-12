package fileio;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name, age and salary:");

		String name = scanner.nextLine();
		int age = scanner.nextInt();
		double salary = scanner.nextDouble();

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);

	}

}
