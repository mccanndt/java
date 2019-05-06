package ui;

import java.util.ArrayList;

import business.CountryIO;
import util.Console;

public class CountryListManagerApp {

	public static void main(String[] args) {
		// Welcome and set up variables
		System.out.println("Country List Manager");
		CountryIO cio = new CountryIO();
		cio.fileSetup();

		displayMenu();

		int menuChoice = 0;
		while (menuChoice != 5) {
			menuChoice = Console.getInt("\nEnter menu number: ", 0, 6);
			System.out.println();
			menuOptions(cio, menuChoice);
		}

		System.out.println("Goodbye.");

	}

	public static void displayMenu() {
		System.out.println("\nCOMMAND MENU");
		System.out.println("1 - List countries");
		System.out.println("2 - Add a country");
		System.out.println("3 - Delete a country");
		System.out.println("4 - Display menu");
		System.out.println("5 - Exit");
	}

	public static void menuOptions(CountryIO cio, int option) {
		ArrayList<String> countries = cio.getCountries();
		switch (option) {
		case 1:
			for (String country : cio.getCountries()) {
				System.out.println(country);
			}
			break;
		case 2:
			countries.add(Console.getString("Enter country: "));
			if (cio.saveCountries(countries)) {
				System.out.println("This country has been saved.");
			}
			break;
		case 3:
			if (countries.remove(Console.getString("Enter which country to delete: "))) {
				cio.saveCountries(countries);
				System.out.println("Country has been deleted succesfully.");
			} else {
				System.out.println("Country did not exist. No changes.");
			}
			break;
		case 4:
			displayMenu();
			break;
		}
	}
}
