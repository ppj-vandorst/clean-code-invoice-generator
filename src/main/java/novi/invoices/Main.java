package novi.invoices;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InvoiceGenerator generator = new InvoiceGenerator();

        var orderLines = List.of(new OrderLine(5, 2.99, "Product 1"), new OrderLine(2, 2.00, "Product 2"),
                new OrderLine(1, 6.99, "Product 3"), new OrderLine(3, 12.00, "Product 4"));

        var invoice = generator.generateInvoice(orderLines);

        System.out.println(invoice);
    }
}
