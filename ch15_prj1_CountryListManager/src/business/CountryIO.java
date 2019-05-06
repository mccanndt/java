package business;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class CountryIO {

	Path countriesPath;
	File countriesFile;

	public ArrayList<String> getCountries() {
		ArrayList<String> list = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(countriesFile))) {
			String line = in.readLine();
			while (line != null) {
				list.add(line);
				line = in.readLine();
			}
		} catch (IOException e) {
			System.out.println(countriesFile.getAbsolutePath() + " doesn't exist.");
			e.printStackTrace();
		}
		return list;
	}

	public boolean saveCountries(ArrayList<String> countries) {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countriesFile)))) {
			for (String country : countries) {
				out.println(country);
			}
			return true;
		} catch (IOException e) {
			System.out.println(countriesFile.getAbsolutePath() + " doesn't exist.");
			e.printStackTrace();
		}
		return false;
	}

	public void fileSetup() {
		countriesPath = Paths.get("countries.txt");
		countriesFile = countriesPath.toFile();
	}
}
