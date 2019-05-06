package ui;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class FileCleanerApp {

	public static void main(String[] args) {

		// Original file
		Path sourceProspectPath = Paths.get("prospects.csv");
		File sourceProspectFile = sourceProspectPath.toFile();

		// New file
		Path newProspectPath = Paths.get("prospects_clean.csv");
		File newProspectFile = newProspectPath.toFile();

		// Welcome Message
		System.out.println("File Cleaner\n");
		System.out.println("Source file:\t" + sourceProspectFile.getName());

		// Try reading/writing/processing
		try (BufferedReader in = new BufferedReader(new FileReader(sourceProspectFile));
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(newProspectFile)))) {
			// Variables
			ArrayList<String> cleanValues = new ArrayList<>();
			String firstName = "";
			String lastName = "";
			String email = "";

			// Start processing orignal file
			String line = in.readLine();
			while (line != null) {
				// Read all values
				String[] s = line.split(",");
				firstName = s[0];
				lastName = s[1];
				email = s[2];

				// Format to requirements
				firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
				lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
				email = email.toLowerCase();

				// Trim whitespace
				firstName = firstName.trim();
				lastName = lastName.trim();
				email = email.trim();

				// Add to ArrayList
				cleanValues.add(firstName + "," + lastName + "," + email);

				// Continue on to next line
				line = in.readLine();
			}

			// Write clean values to new file
			for (String value : cleanValues) {
				out.println(value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Cleaned file:\t" + newProspectFile.getName());

		System.out.println("\nCongratulations! Your file has been cleaned!");

	}

}
