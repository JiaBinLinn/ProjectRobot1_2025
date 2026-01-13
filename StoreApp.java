import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        // Initialize product catalog (simulated database)
        ProductCatalog catalog = new ProductCatalog();
        // Initialize register with product catalog
        Register register = new Register(catalog);
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        // System welcome message
        System.out.println("Welcome to Agile PoS System (v1.0)");
        System.out.println("System Initialized...");

        // TODO: Menu logic will be implemented by branches
        // Developer A adds "Process Sale"
        // Developer B adds "Handle Returns"
        
        // Exit message
        System.out.println("Exiting...");
        // Close scanner to release resource
        scanner.close();
    }
}
