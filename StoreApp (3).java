import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        Register register = new Register(catalog);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Agile PoS System - Return Mode");

        // Menu logic for Return Branch
        // (Developer B assumes this is option 2 or the only option)
        System.out.println("2. Handle Return");
        System.out.println("0. Exit");
        System.out.print("Select: ");
        int choice = scanner.nextInt();

        if (choice == 2) {
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
        }

        System.out.println("Exiting Return Module...");
        scanner.close();
    }
}
