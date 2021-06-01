package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderingProcessor {

    private InformationService informationService;
    private OrderingService orderingService;

    public OrderingProcessor(InformationService informationService, OrderingService orderingService) {
        this.informationService = informationService;
        this.orderingService = orderingService;
    }

    public OrderingDTO process(final OrderingDetails orderingDetails) {

        boolean orderCompleted = orderingService.orderExecute(orderingDetails.getSupplier(),
                orderingDetails.getProduct(), orderingDetails.getProductQuantity());

        if(orderCompleted) {
            informationService.inform(orderingDetails.getSupplier(),orderingDetails.getProduct(),
                    orderingDetails.getProductQuantity());
            return new OrderingDTO(orderingDetails.getSupplier(), true);
        } else {
            return new OrderingDTO(orderingDetails.getSupplier(), false);
        }
    }
}