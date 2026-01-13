public class ReturnLineItem {
    private ProductDescription description;
    private int quantity;

    public ReturnLineItem(ProductDescription desc, int qty) {
        this.description = desc;
        this.quantity = qty;
    }

    public String getName() { return description.getDescription(); }
    public int getQuantity() { return quantity; }
    public double getSubtotal() { return description.getPrice() * quantity; }
}
