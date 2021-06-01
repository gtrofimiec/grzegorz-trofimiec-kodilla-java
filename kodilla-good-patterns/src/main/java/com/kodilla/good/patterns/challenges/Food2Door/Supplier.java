package com.kodilla.good.patterns.challenges.Food2Door;

public class Supplier implements SuppliersService {

    public String supplierName;

    public Supplier(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void process (OrderingDetails orderingDetails) {
        OrderingProcessor orderingProcessor = new OrderingProcessor
                (new MailService(), new OrderingExecution());
        orderingProcessor.process(orderingDetails);
    }
}
