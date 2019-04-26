
public class ProductDemoApp {

	public static void main(String[] args) {
		System.out.println("Product Demo App");
		
		Product p1 = new Product("java", "Murach's Java Programming", 57.50);
		Product p2 = new Product("mysql", "Murach's MySQL", 54.50);
		
		System.out.println(p1);
		System.out.println(p2.toString());
		
		System.out.println("bye");
	}

}
