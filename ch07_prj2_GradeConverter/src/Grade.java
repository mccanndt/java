
public class Grade {
	// Variables
	int number;
	String letter;
	
	// Constructors
	public Grade() {
		number = 0;
	}
	
	public Grade(int number) {
		this.number = number;
	}

	// Getters / setters
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getLetter() {
		return letter;
	}
	
	// Misc. Methods
	public static String convertGrade(int number) {
		String s = "";
		
		if (number >= 88) {
			s = "Letter grade: A";
		} else if (number >= 80) {
			s = "Letter grade: B";
		} else if (number >= 67) {
			s = "Letter grade: C";
		} else if (number >= 60) {
			s = "Letter grade: D";
		} else if (number < 60) {
			s = "Letter grade: F";
		}
		
		return s;
	}
}
