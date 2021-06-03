package com.kodilla.good.patterns.challenges.Food2Door;

public class SupplierConstructor implements Supplier {

    String supplierName;
    String productType;

    public SupplierConstructor(String supplierName, String productType) {
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
        this.process(orderingDetails);
    }
}