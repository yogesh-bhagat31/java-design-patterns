package com.yogesh.lld.solidprinciples.srp.goodcode;

public class OrderProcessingService {

    private final PriceCalculator priceCalculator;
    private final OrderRepository orderRepository;
    private final OrderNotificationService notificationService;
    private final InvoicePrinter invoicePrinter;

    public OrderProcessingService(PriceCalculator priceCalculator, OrderRepository orderRepository,
                                  OrderNotificationService notificationService, InvoicePrinter invoicePrinter) {
        this.priceCalculator = priceCalculator;
        this.orderRepository = orderRepository;
        this.notificationService = notificationService;
        this.invoicePrinter = invoicePrinter;
    }

    public void processOrder(Order order) {
        double total = priceCalculator.calculateTotal(order);
        System.out.println("calculating price");
        orderRepository.save(order, total);
        notificationService.sendConfirmation(order, total);
        invoicePrinter.print(order, total);
    }
}
