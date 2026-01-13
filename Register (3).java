public class Register {
    private ProductCatalog catalog;
    private ReturnTransaction currentReturn; // Only knows about returns

    public Register(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    // Logic for Branch: Handling Returns
    public void makeNewReturn() {
        currentReturn = new ReturnTransaction();
    }

    public void enterReturnItem(int id, int qty) {
        ProductDescription desc = catalog.getProductDescription(id);
        if (desc != null) {
            currentReturn.addReturnItem(desc, qty);
        } else {
            System.out.println("Item not found in catalog!");
        }
    }

    public void endReturn() {
        currentReturn.printRefundSlip();
        // Simulate inventory restocking
        System.out.println("Inventory restocked with returned items.");
    }
}
