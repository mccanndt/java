import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter\n");
		Scanner sc = new Scanner(System.in);
		
		double grade = 0;
		
		String cont = "y";
		
		while (cont.equalsIgnoreCase("y")) {
			System.out.print("Enter numerical grade: ");
			grade = sc.nextInt();
			
			if (grade >= 88) {
				System.out.println("Letter Grade: A");
			} else if (grade >= 80) {
				System.out.println("Letter Grade: B");
			} else if (grade >= 67) {
				System.out.println("Letter Grade: C");
			} else if (grade >= 60) {
				System.out.println("Letter Grade: D");
			} else {
				System.out.println("Letter Grade: F");
			}
			
			System.out.print("\nContinue? (y/n): ");
			
			cont = sc.next();
			
			System.out.println();
		}
		sc.close();
	}

}
