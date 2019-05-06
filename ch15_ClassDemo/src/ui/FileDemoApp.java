package ui;

import java.io.*;
import java.nio.file.*;

import business.Product;

public class FileDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome!\n");

		try {
			String dirString = "c:/temp";
			Path dirPath = Paths.get(dirString);

			// Create directory
			if (Files.notExists(dirPath)) {
				Files.createDirectories(dirPath);
				System.out.println("Directory successfully created!");
			} else {
				System.out.println("Directory already exists.");
			}

			// Create file
			String fileString = "products.txt";
			Path filePath = Paths.get(dirString, fileString);
			if (Files.notExists(filePath)) {
				Files.createFile(filePath);
				System.out.println(fileString + " successfully created!");
			} else {
				System.out.println(fileString + " already exists.");
			}

			// Sysouts
			System.out.println("File name: " + filePath.getFileName());
			System.out.println("Absolute path: " + filePath.toAbsolutePath());
			System.out.println("Is writable: " + Files.isWritable(filePath));

			// Print all files in a directory
			System.out.println("\nFiles in a directory\n");
			if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
				System.out.println("Directory: " + dirPath.toAbsolutePath());
				System.out.println("Files: ");
				DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
				for (Path p : dirStream) {
					if (Files.isRegularFile(p)) {
						System.out.println("    " + p.getFileName());
					}
				}
			}

			// Write to a file
			// This is NOT the same products.txt as the one above
			Path productsPath = Paths.get("products.txt");
			File productsFile = productsPath.toFile();
			// Open output stream
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(productsFile)));
			// Write data to the stream
			out.println("java\tMurach's Java Programming\t57.50");
			// Close the stream to avoid a resource leak
			out.close();

			// Read from the file
			BufferedReader in = new BufferedReader(new FileReader(productsFile));
			// Read data from stream and print to console
			String line = in.readLine();
			System.out.println(line);
			// Close the stream to avoid a resource leak
			in.close();

			// Bonus instruction - map this line to a Product
			String[] fields = line.split("\t");
			String code = fields[0];
			String desc = fields[1];
			double price = Double.parseDouble(fields[2]);

			Product p = new Product(code, desc, price);
			System.out.println(p);

		} catch (IOException e) {
			System.out.println("Bad directory or file path enetered.");
			e.printStackTrace();
		}

		System.out.println("\nBye!");

	}

}
