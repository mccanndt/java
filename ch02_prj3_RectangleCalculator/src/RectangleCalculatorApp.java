import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator\n");
		Scanner sc = new Scanner(System.in);
		
		//String choice = "y";
		Boolean choice = true;
		
		//while(choice.equalsIgnoreCase("y")) {
		while(choice == true) {
			System.out.print("Enter length: ");
			double length = sc.nextDouble();
			System.out.print("Enter width: ");
			double width = sc.nextDouble();

			double area = width * length;
			double perimeter = (2 * width) + (2 * length);
			
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			
			System.out.print("\nContinue? (y/n): ");
			if (sc.next().equalsIgnoreCase("n")) {
				choice = false;
			}
			//choice = sc.next();
			System.out.println();
		}
		sc.close();
	}

}
