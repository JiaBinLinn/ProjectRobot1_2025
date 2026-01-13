import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        Register register = new Register(catalog);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Agile PoS System (Final Version)");

        while (true) {
            // MERGED MENU: Showing options from both branches
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Process Sale");
            System.out.println("2. Handle Return");
            System.out.println("0. Exit");
            System.out.print("Select: ");
            
            int choice = scanner.nextInt();

            if (choice == 1) {
                // --- Logic from Sales Branch ---
                System.out.println(">> Entering Sales Mode");
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

            } else if (choice == 2) {
                // --- Logic from Return Branch ---
                System.out.println(">> Entering Return Mode");
                register.makeNewReturn();
                while (true) {
                    System.out.print("Enter Return Item ID (or 0 to finish): ");
                    int id = scanner.nextInt();
                    if (id == 0) break;
                    System.out.print("Enter Quantity: ");
                    int qty = scanner.nextInt();
                    register.enterReturnItem(id, qty);
                }
                register.endReturn();

            } else if (choice == 0) {
                System.out.println("Exiting System...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
