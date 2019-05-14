package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import business.Contact;

public class StreamDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Streams Demo App\n");

		List<Contact> contacts = new ArrayList<>();

		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		
		// Filter using Predicate interface
		System.out.println("No phone numbers using Predicate:");
		contacts.stream()
			.filter(c -> c.getPhone() == null)
			.forEach(c -> System.out.println(c.getName()));
		
		// Filter and collect
		System.out.println("\nEmails using collect:");
		List<Contact> contactsNoEmail = contacts.stream()
			.filter(c-> c.getEmail() == null)
			.collect(Collectors.toList());
		System.out.println("There are " + contactsNoEmail.size() + " contacts with no email.");
		
		// Map and collect
		System.out.println("\nUsing map and collect:");
		List<String> contactNames = contacts.stream()
				.map(Contact::getName)
				.collect(Collectors.toList());
		contactNames.stream().forEach(System.out::println);
		
		// Reduce a list
		System.out.println("\nMap and reduce a list:");
		String csv = contacts.stream()
				.map(c -> c.getName())
				.reduce("", (a, b) -> a + b + ",");
		csv = csv.substring(0, csv.length() - 1);
		System.out.println(csv);
		
		System.out.println("\nGoodbye!");

	}

}
