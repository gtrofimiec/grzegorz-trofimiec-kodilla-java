package com.kodilla.good.patterns.challenges.Food2Door;

public class MailService implements InformationService {

    @Override
    public void inform(Supplier supplier, Product product, double productQuantity) {
        System.out.println("Order sent from "+supplier.getSupplierName()
                +". Ordered product: "+product.getProductName()
                +" ("+productQuantity+" item)");
    }
}
