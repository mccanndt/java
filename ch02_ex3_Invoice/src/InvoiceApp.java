import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        int invoiceCount = 0;
        double invoiceTotal = 0.0;
        double discountTotal = 0.0;
        double invoiceAverage = 0.0;
        double discountAverage = 0.0;
        
        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (!choice.equalsIgnoreCase("n")) {
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            // calculate the discount amount and total
            double discountPercent;
            if (subtotal >= 500) {
                discountPercent = .25;
            } else if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;

            // Math
            invoiceCount += 1;
            invoiceTotal += total;
            discountTotal += discountAmount;
            
            
            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";            
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
            
        }
        invoiceAverage = invoiceTotal / invoiceCount;
        discountAverage = discountTotal / invoiceCount;
        
        System.out.println("Number of invoices: " + invoiceCount);
        System.out.println("Average invoice: " + invoiceAverage);
        System.out.println("Average discount: " + discountAverage);
    }
}