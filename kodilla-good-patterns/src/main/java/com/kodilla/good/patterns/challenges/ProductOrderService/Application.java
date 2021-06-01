package com.kodilla.good.patterns.challenges.ProductOrderService;

public class Application {

    public static void main(String[] args) {

        OrderingRequestRetriever orderingRequestRetriever = new OrderingRequestRetriever();
        OrderingRequest orderingRequest = orderingRequestRetriever.retrieve();

        OrderingProcessor orderingProcessor = new OrderingProcessor(new MailService(), new OrderingExecution(),
                new OrderingRep());
        orderingProcessor.process(orderingRequest);
    }
}