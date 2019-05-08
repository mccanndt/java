package ui;

import java.util.List;

import business.Product;
import db.DAO;
import db.ProductTextFile;
import util.Console;
import util.StringUtils;

public class ProductIOManagerApp {

	private static DAO<Product> productDAO = new ProductTextFile();

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Manager - Text File Edition\n");
		displayMenu();

		String action = "";
		while (!action.equalsIgnoreCase("exit")) {
			// Get input from user
			action = Console.getString("Enter a command: ");
			System.out.println();

			if (action.equalsIgnoreCase("list")) {
				displayAllProducts();
			} else if (action.equalsIgnoreCase("add")) {
				addProduct();
			} else if (action.equalsIgnoreCase("del")) {
				deleteProduct();
			} else if (action.equalsIgnoreCase("help")) {
				displayMenu();
			} else {
				System.out.println("Error! Not a valid command.\n");
			}
		}

		System.out.println("Bye!");
	}

	public static void displayMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("list    - List all products");
		System.out.println("add     - Add a product");
		System.out.println("del     - Delete a product");
		System.out.println("help    - Show this menu");
		System.out.println("exit    - Exit this application\n");
	}

	public static void displayAllProducts() {
		System.out.println("PRODUCT LIST\n");

		List<Product> products = productDAO.getAll();
		StringBuilder sb = new StringBuilder();
		for (Product p : products) {
			sb.append(StringUtils.padWithSpaces(p.getCode(), 8));
			sb.append(StringUtils.padWithSpaces(p.getDescription(), 40));
			sb.append(p.getPrice());
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	public static void addProduct() {
		String code = Console.getString("Enter product code: ");
		String description = Console.getString("Enter product description: ");
		double price = Console.getDouble("Enter price: ");

		Product p = new Product(code, description, price);
		if (productDAO.add(p)) {
			System.out.println("Product " + p.getCode() + " successfully added.");
		} else {
			System.out.println("Error adding product.");
		}

	}

	public static void deleteProduct() {
		String code = Console.getString("Enter product code to delete: ");

		Product p = productDAO.get(code);
		if (p != null) {
			if (productDAO.delete(p)) {
				System.out.println(p.getCode() + " has been deleted.");
			} else {
				System.out.println("Error deleting product.");
			}
		} else {
			System.out.println("No product matches that code.\n");
		}
	}
}
