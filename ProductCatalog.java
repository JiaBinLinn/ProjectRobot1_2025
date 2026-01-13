import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    // Map to store product ID as key and ProductDescription as value
    private Map<Integer, ProductDescription> products = new HashMap<>();

    // Constructor: pre-load dummy product data
    public ProductCatalog() {
        // Add sample products to the catalog
        products.put(101, new ProductDescription(101, 2.50, "Milk"));
        products.put(102, new ProductDescription(102, 5.00, "Bread"));
        products.put(103, new ProductDescription(103, 12.99, "Coffee"));
        products.put(104, new ProductDescription(104, 1.99, "Apple"));
    }

    // Method to get product details by product ID
    public ProductDescription getProductDescription(int id) {
        return products.get(id);
    }
}
