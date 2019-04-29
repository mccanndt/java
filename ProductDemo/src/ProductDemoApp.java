
public class ProductDemoApp {

	public static void main(String[] args) {
		System.out.println("Product Demo App");
		
//		Product p1 = new Product("java", "Murach's Java Programming", 57.50);
//		Product p2 = new Product("mysql", "Murach's MySQL", 54.50);
//		
//		System.out.println(p1);
//		System.out.println(p2.toString());
		
		Book b1 = new Book("java", "Java Programming", 57.50, "Joel Murach");
		Book b2 = new Book("java", "Java Programming", 57.50, "Joel Murach");
		System.out.println(b1.equals(b2));
		System.out.println(b1 == b2);
		
		String choice = "y";
		System.out.println(choice.equals("y"));
		System.out.println(choice == "y");
		System.out.println("bye");
	}

}
