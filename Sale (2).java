import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<SalesLineItem> lineItems = new ArrayList<>();
    private Payment payment;

    public void makeLineItem(ProductDescription desc, int quantity) {
        lineItems.add(new SalesLineItem(desc, quantity));
    }

    public double getTotal() {
        double total = 0;
        for (SalesLineItem item : lineItems) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void makePayment(double cashTendered) {
        this.payment = new Payment(cashTendered);
    }

    public double getChange() {
        return payment.getAmount() - getTotal();
    }

    public void printReceipt() {
        System.out.println("\n--- SALE RECEIPT ---");
        for (SalesLineItem item : lineItems) {
            System.out.println(item.toString());
        }
        System.out.printf("Total: $%.2f\n", getTotal());
        System.out.printf("Payment: $%.2f\n", payment.getAmount());
        System.out.printf("Change: $%.2f\n", getChange());
        System.out.println("--------------------\n");
    }
}
