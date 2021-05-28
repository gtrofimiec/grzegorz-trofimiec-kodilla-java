package com.kodilla.good.patterns.challenges.ProductOrderService;

public class MailService implements InformationService {

    public void inform(Customer customer) {
        System.out.println("Order sent to " + customer.getCustomerName());
    }
}