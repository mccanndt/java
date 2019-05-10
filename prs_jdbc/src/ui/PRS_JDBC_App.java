package ui;

import java.util.List;

import business.User;
import db.DAO;
import db.UserDB;
import util.Console;
import util.StringUtils;

public class PRS_JDBC_App {
	
	private static DAO<User> userDAO = new UserDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS App\n");

		// Display menu
		displayMainMenu();

		String action = "";
		while (!action.equalsIgnoreCase("exit")) {
			// Get input from user
			action = Console.getString("Enter a command: ");
			System.out.println();

			if (action.equalsIgnoreCase("list")) {
				displayAllUsers();
			} else if (action.equalsIgnoreCase("add")) {
				addUser();
			} else if (action.equalsIgnoreCase("del")) {
				deleteUser();
			} else if (action.equalsIgnoreCase("help")) {
				displayMainMenu();
			} else if (!action.equalsIgnoreCase("exit")) {
				System.out.println("Error! Not a valid command.\n");
			}
		}

		System.out.println("Bye!");

	}

	private static void displayMainMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("list    - List all users");
		System.out.println("add     - Add a user");
		System.out.println("del     - Delete a user");
		System.out.println("help    - Show this menu");
		System.out.println("exit    - Exit this application\n");
	}

	public static void displayAllUsers() {
		System.out.println("USER LIST\n");

		List<User> users = userDAO.getAll();
		StringBuilder sb = new StringBuilder();
		for (User u : users) {
			sb.append(StringUtils.padWithSpaces(Integer.toString(u.getId()), 4));
			sb.append(StringUtils.padWithSpaces(u.getUserName(), 22));
			sb.append(StringUtils.padWithSpaces(u.getFirstName(), 22));
			sb.append(StringUtils.padWithSpaces(u.getLastName(), 22));
			sb.append(StringUtils.padWithSpaces(Boolean.toString(u.isReviewer()), 8));
			sb.append(StringUtils.padWithSpaces(Boolean.toString(u.isAdmin()), 8));
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	public static void addUser() {
		String userName = Console.getString("Enter the UserName: ");
		String password = Console.getString("Enter the password: ");
		String firstName = Console.getString("Enter first name: ");
		String lastName = Console.getString("Enter last name: ");
		String phoneNumber = Console.getString("Enter phone number: ");
		String email = Console.getString("Enter email: ");
		boolean isReviewer = false;
		if(Console.getString("Is the user a reviewer? (y/n): ", "y", "n").equalsIgnoreCase("y")) {
			isReviewer = true;
		}
		
		boolean isAdmin = false;
		if(Console.getString("Is the user an admin? (y/n): ", "y", "n").equalsIgnoreCase("y")) {
			isAdmin = true;
		}

		User u = new User(userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
		if (userDAO.add(u)) {
			System.out.println("User " + u.getUserName() + " successfully added.");
		} else {
			System.out.println("Error adding product.");
		}

	}

	public static void deleteUser() {
		int id = Console.getInt("Enter user ID to delete: ", 0, Integer.MAX_VALUE);

		User u = userDAO.get(id);
		if (u != null) {
			if (userDAO.delete(u)) {
				System.out.println(u.getUserName() + " has been deleted.");
			} else {
				System.out.println("Error deleting user.");
			}
		} else {
			System.out.println("No user matches that ID.\n");
		}
	}

}
