public class SalesLineItem {
    private ProductDescription description;
    private int quantity;

    public SalesLineItem(ProductDescription desc, int qty) {
        this.description = desc;
        this.quantity = qty;
    }

    public double getSubtotal() {
        return description.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return String.format("%-10s x%d  $%.2f", 
            description.getDescription(), quantity, getSubtotal());
    }
}
