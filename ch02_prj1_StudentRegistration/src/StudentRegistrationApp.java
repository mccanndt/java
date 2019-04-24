import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Student Registration Form");
		Scanner sc = new Scanner(System.in);
		
		String firstName = "";
		String lastName = "";
		String year = "";
		
		System.out.print("Enter first name: ");
		firstName = sc.nextLine();
		
		System.out.print("Enter last name: ");
		lastName = sc.nextLine();
		
		System.out.print("Enter year of birth: ");
		year = sc.nextLine();
		
		System.out.println("Welcome " + firstName + " " + lastName);
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + firstName + "*" + year);
		sc.close();
	}

}
