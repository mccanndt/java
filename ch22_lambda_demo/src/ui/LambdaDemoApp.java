package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import business.Contact;

public class LambdaDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Lambda Demo App\n");

		List<Contact> contacts = new ArrayList<>();

		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		// No lambda: Which contacts have no email?
		List<Contact> contactsWithoutEmail = new ArrayList<>();
		for (Contact c : contacts) {
			if (c.getEmail() == null) {
				contactsWithoutEmail.add(c);
			}
		}
		System.out.println("Contacts with no email (no lambda):");
		for (Contact c : contactsWithoutEmail) {
			System.out.println(c);
		}

		// No lambda: Which contacts have no phone number?
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c : contacts) {
			if (c.getPhone() == null) {
				contactsWithoutPhone.add(c);
			}
		}
		System.out.println("\nContacts with no phone (no lambda):");
		for (Contact c : contactsWithoutPhone) {
			System.out.println(c);
		}

		System.out.println("\n----------------Lambdas----------------\n");
		// With lambda: No phone
		System.out.println("Contacts with no phones: ");
		contactsWithoutPhone = filterContacts(contacts, c -> c.getPhone() == null);
		System.out.println("\nContacts with no phone:");
		for (Contact c : contactsWithoutPhone) {
			System.out.println(c);
		}

		// With lambda: No email
		System.out.println("Contacts with no email: ");
		contactsWithoutEmail = filterContacts(contacts, c -> c.getEmail() == null);
		System.out.println("\nContacts with no email:");
		for (Contact c : contactsWithoutEmail) {
			System.out.println(c);
		}
		
		System.out.println("\n----------------Streams----------------\n");
		
		System.out.println("Bye!");
	}

	private static List<Contact> filterContacts(List<Contact> contacts, Predicate<Contact> condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c : contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}

}
