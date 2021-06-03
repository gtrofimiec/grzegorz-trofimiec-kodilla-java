package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop extends SupplierConstructor {

    public GlutenFreeShop(String supplierName, String productType) {
        super(supplierName, productType);
    }

    public void process (OrderingDetails orderingDetails) {
        OrderingProcessor orderingProcessor = new OrderingProcessor
                (new MailService(), new OrderingExecution());
        if(orderingDetails.getProduct().productType.equals(orderingDetails.getSupplier().getProductType())) {
            orderingProcessor.process(orderingDetails);
        } else {
            System.out.println("Product " + orderingDetails.getProduct().productType
                    + " not available from this supplier (" + orderingDetails.getSupplier().getProductType() + ")");
        }
    }
}