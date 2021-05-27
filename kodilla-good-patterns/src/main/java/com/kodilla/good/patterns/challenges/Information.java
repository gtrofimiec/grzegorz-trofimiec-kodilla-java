package com.kodilla.good.patterns.challenges;

public class Information implements InformationService{

    public void inform(Customer customer) {
        System.out.println("Send mail to"+customer.customerID);
    }
}
