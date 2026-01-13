public class Register {
    // Reference to the product catalog (simulated database)
    private ProductCatalog catalog;

    // Constructor: inject ProductCatalog dependency
    public Register(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    // TODO: Developer A (Sale Branch) will implement sale methods here
    // TODO: Developer B (Return Branch) will implement return methods here
}
