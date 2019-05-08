package db;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import business.Product;

public class ProductTextFile implements DAO<Product> {
	// Instance Variables
	private List<Product> products = null;
	private Path productsPath = null;
	private File productsFile = null;
	private final String FIELD_SEP = "\t";

	public ProductTextFile() {
		productsPath = Paths.get("products.txt");
		productsFile = productsPath.toFile();
		products = this.getAll();
	}

	@Override
	public Product get(String code) {
		for (Product p : products) {
			if (p.getCode().equals(code)) {
				return p;
			}
		}
		return null;
	}

	@Override
	public List<Product> getAll() {
		// If the products file has been read, don't read again
		// * if this app supported multiple users, this might be dangerous
		if (products != null) {
			return products;
		}

		products = new ArrayList<>();
		if (Files.exists(productsPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(productsFile))) {
				// Read a line from products.txt
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(FIELD_SEP);
					String code = fields[0];
					String description = fields[1];
					double price = Double.parseDouble(fields[2]);
					// Create a product and add it to the list
					Product p = new Product(code, description, price);
					products.add(p);
					// Continue loop
					line = in.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println(productsPath.toAbsolutePath() + " doesn't exist.");
			return null;
		}
		return products;
	}

	@Override
	public boolean add(Product t) {
		products.add(t);
		return this.saveAll();
	}

	@Override
	public boolean update(Product t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Product t) {
		products.remove(t);
		return this.saveAll();
	}

	// When processing text files we will resave the entire file every time we
	// add/update/delete
	private boolean saveAll() {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(productsFile)))) {
			// Write all products in the list to the file
			for (Product p : products) {
				out.print(p.getCode() + FIELD_SEP);
				out.print(p.getDescription() + FIELD_SEP);
				out.println(p.getPrice());
			}
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
