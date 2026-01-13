public class Register {
    private ProductCatalog catalog;
    private Sale currentSale;           // From Sales Branch
    private ReturnTransaction currentReturn; // From Return Branch

    public Register(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    // ==========================================
    // MODULE 1: SALES PROCESSING (Merged)
    // ==========================================
    public void makeNewSale() {
        currentSale = new Sale();
    }

    public void enterItem(int id, int qty) {
        ProductDescription desc = catalog.getProductDescription(id);
        if (desc != null) {
            currentSale.makeLineItem(desc, qty);
            System.out.println("Item added: " + desc.getDescription());
        } else {
            System.out.println("Item not found!");
        }
    }

    public void endSale(double cash) {
        if (currentSale != null) {
            currentSale.makePayment(cash);
            currentSale.printReceipt();
            // In a real app, we would reduce inventory here
            currentSale = null; // Reset
        }
    }

    // ==========================================
    // MODULE 2: RETURN HANDLING (Merged)
    // ==========================================
    public void makeNewReturn() {
        currentReturn = new ReturnTransaction();
    }

    public void enterReturnItem(int id, int qty) {
        ProductDescription desc = catalog.getProductDescription(id);
        if (desc != null) {
            currentReturn.addReturnItem(desc, qty);
            System.out.println("Return Item recorded: " + desc.getDescription());
        } else {
            System.out.println("Item not found in catalog!");
        }
    }

    public void endReturn() {
        if (currentReturn != null) {
            currentReturn.printRefundSlip();
            // In a real app, we would increase inventory here
            currentReturn = null; // Reset
        }
    }
}
