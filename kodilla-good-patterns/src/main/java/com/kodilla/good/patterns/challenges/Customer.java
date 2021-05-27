package com.kodilla.good.patterns.challenges;

public class Customer implements CustomersDataBase {

    public int customerID;

    public Customer(int customerID) {
        this.customerID = customerID;
    }

    @Override
    public int getCustomerID() {
        return customerID;
    }
}
