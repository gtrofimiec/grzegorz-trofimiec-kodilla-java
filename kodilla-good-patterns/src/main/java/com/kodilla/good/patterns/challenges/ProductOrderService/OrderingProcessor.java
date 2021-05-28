package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderingProcessor {

    private InformationService informationService;
    private OrderingService orderingService;
    private OrderingRepository orderingRepository;

    public OrderingProcessor(final InformationService informationService, final OrderingService orderingService,
                             final OrderingRepository orderingRepository) {
        this.informationService = informationService;
        this.orderingService = orderingService;
        this.orderingRepository = orderingRepository;
    }

    public OrderingDTO process(final OrderingRequest orderingRequest) {

        boolean orderCompleted = orderingService.orderExecute(orderingRequest.getCustomer(),
                orderingRequest.getProduct());

        if(orderCompleted) {
            informationService.inform(orderingRequest.getCustomer());
            orderingRepository.createOrdering(orderingRequest.getCustomer(),
                    orderingRequest.getProduct());
            return new OrderingDTO(orderingRequest.getCustomer(), true);
        } else {
            return new OrderingDTO(orderingRequest.getCustomer(), false);
        }
    }
}