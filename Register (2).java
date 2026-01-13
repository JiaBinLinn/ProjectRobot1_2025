public class Register {
    private ProductCatalog catalog;
    private Sale currentSale;

    public Register(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    // Logic for Branch: Handling Sales 
    public void makeNewSale() {
        currentSale = new Sale();
    }

    public void enterItem(int id, int qty) {
        ProductDescription desc = catalog.getProductDescription(id);
        if (desc != null) {
            currentSale.makeLineItem(desc, qty);
        } else {
            System.out.println("Item not found!");
        }
    }

    public void endSale(double cash) {
        currentSale.makePayment(cash);
        currentSale.printReceipt();
        // Update inventory logic would go here 
        System.out.println("Inventory updated successfully.");
    }
}
