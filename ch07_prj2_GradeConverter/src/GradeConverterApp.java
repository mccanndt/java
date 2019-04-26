
public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			int number = Console.getInt("Enter numberical grade: ", -1, 101);
			System.out.println(Grade.convertGrade(number));
			
			choice = Console.getString("\nContinue? (y/n): ");
		}
	}
}
