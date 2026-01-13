import java.util.ArrayList;
import java.util.List;

public class ReturnTransaction {
    private List<ReturnLineItem> returnedItems = new ArrayList<>();
    
    // Record a returned item
    public void addReturnItem(ProductDescription desc, int quantity) {
        returnedItems.add(new ReturnLineItem(desc, quantity));
    }

    // Calculate total refund amount
    public double getTotalRefund() {
        double total = 0;
        for (ReturnLineItem item : returnedItems) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void printRefundSlip() {
        System.out.println("\n--- REFUND SLIP ---");
        for (ReturnLineItem item : returnedItems) {
            System.out.printf("%-10s x%d  -$%.2f\n", 
                item.getName(), item.getQuantity(), item.getSubtotal());
        }
        System.out.printf("Total Refund: -$%.2f\n", getTotalRefund());
        System.out.println("-------------------\n");
    }
}
