package InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicFileIO {

	public static void main(String[] args) {

		// write to the file
		File file = new File("Text.txt");
		PrintWriter output;
		try {
			output = new PrintWriter(file);
			output.println("Cristian Chira");
			output.println(42);
			output.close();
		} catch (FileNotFoundException er) {
			System.out.printf("Error: %s\n", er);
		}

		// Read from file
		try {
			Scanner input = new Scanner(file);
			String name = input.nextLine();
			int age = input.nextInt();
			System.out.printf("Name: %s Age %d ", name, age);
		} catch (FileNotFoundException er) {
			System.out.printf("Error: %s\n", er);

		}
	}

}
