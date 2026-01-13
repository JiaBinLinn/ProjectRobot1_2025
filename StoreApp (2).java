import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        Register register = new Register(catalog);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Agile PoS System - Sales Mode");

        // Menu logic for Sale Branch [cite: 27]
        System.out.println("1. New Sale");
        System.out.println("0. Exit");
        System.out.print("Select: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            register.makeNewSale();
            while (true) {
                System.out.print("Enter Item ID (or 0 to finish): ");
                int id = scanner.nextInt();
                if (id == 0) break;
                System.out.print("Enter Quantity: ");
                int qty = scanner.nextInt();
                register.enterItem(id, qty);
            }
            System.out.print("Enter Cash Payment: ");
            double cash = scanner.nextDouble();
            register.endSale(cash);
        }

        System.out.println("Exiting Sale Module...");
        scanner.close();
    }
}
