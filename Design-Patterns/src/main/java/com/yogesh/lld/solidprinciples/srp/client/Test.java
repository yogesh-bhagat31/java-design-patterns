package com.yogesh.lld.solidprinciples.srp.client;

import com.yogesh.lld.basics.solidprinciples.srp.goodcode.*;
import com.yogesh.lld.solidprinciples.srp.goodcode.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

    private final OrderProcessingService orderProcessingService;

    public Test(OrderProcessingService orderProcessingService) {
        this.orderProcessingService = orderProcessingService;
    }

    public static void main(String[] args) {

        //Setting Order
        ArrayList<String> list = new ArrayList<>();
        list.add("TV");
        list.add("Mobile");

        Order order = new Order("ord-123", list, 1000000.0, "order@gmail.com");

        //Setting PriceCalculator
        Map<String, Double> priceMap = new HashMap<>();
        priceMap.put("TV", 100000.0);
        priceMap.put("Mobile", 5000.0);

        PriceCalculator priceCalculator = new PriceCalculator(priceMap);

        //Setting OrderRepository
        OrderRepository orderRepository = new OrderRepository();

        //Setting OrderNotificationService
        EmailClient emailClient = new EmailClient();
        OrderNotificationService orderNotificationService = new OrderNotificationService(emailClient);

        //Setting InvoicePrinter
        InvoicePrinter invoicePrinter = new InvoicePrinter();

        //Lets process an order
        OrderProcessingService processingService = new OrderProcessingService(priceCalculator, orderRepository, orderNotificationService, invoicePrinter);
        processingService.processOrder(order);


    }
}
