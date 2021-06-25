package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    void InvoiceDaoTestSuite() {
        //Given
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        Product product3 = new Product("Product 3");
        Item item1 = new Item(BigDecimal.valueOf(100), 2, BigDecimal.valueOf(200));
        Item item2 = new Item(BigDecimal.valueOf(50), 1, BigDecimal.valueOf(50));
        Item item3 = new Item(BigDecimal.valueOf(10), 3, BigDecimal.valueOf(30));
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        Invoice invoice = new Invoice("01/2021");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
        try {
            invoiceDao.deleteById(invoiceId);
        } catch (Exception e) {
            //do nothing
        }
    }
}