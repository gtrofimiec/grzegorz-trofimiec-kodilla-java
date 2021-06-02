package com.kodilla.good.patterns.challenges.Food2Door;

public class Supplier implements SuppliersService {

    public String supplierName;
    public String productType;

    public Supplier(String supplierName, String productType) {
        this.supplierName = supplierName;
        this.productType = productType;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getProductType() {
        return productType;
    }

    public void process (OrderingDetails orderingDetails) {
        OrderingProcessor orderingProcessor = new OrderingProcessor
                (new MailService(), new OrderingExecution());
        if(orderingDetails.getProduct().productType.equals(orderingDetails.getSupplier().getProductType())) {
            orderingProcessor.process(orderingDetails);
        } else {
            System.out.println("Product not available from this supplier");
        }
    }
}