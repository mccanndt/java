package ui;

import java.util.ArrayList;
import java.util.List;

import business.*;
import util.Console;

public class AnimalListApp {

	public static void main(String[] args) {
		// Variables and initialization
		List<Animal> animals = new ArrayList<>();
		String choice = "y";
		System.out.println("Welcome to the Animal List");

		// Loop and get animal selections
		while (choice.equalsIgnoreCase("y")) {
			displayMenu();

			// Ask for user input
			int type = Console.getInt("Choose type: ", 0, 4);
			String name = Console.getString("Enter animal's name: ");
			
			// Add selections to list
			animals.add(setChoices(type, name));
			
			// Loop question
			choice = Console.getString("\nContinue? (y/n): ", "y", "n");
		}
		
		// Print out 
		System.out.println("\nNow let's hear the animals speak!");
		System.out.println("---------------------------------");
		animals.stream().forEach(Animal::speak);

	}

	private static void displayMenu() {
		System.out.println("\nType of animal:");
		System.out.println("1 - Dog");
		System.out.println("2 - Cat");
		System.out.println("3 - Turtle");
		System.out.println();
	}

	private static Animal setChoices(int type, String name) {

		switch (type) {
		case 1:
			return new Dog(name);
		case 2:
			return new Cat(name);
		case 3:
			return new Turtle(name);
		default:
			return null;

		}

	}

}
