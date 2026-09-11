package com.yogesh.lld.solidprinciples.srp.goodcode;

import java.util.Map;

public class PriceCalculator {

    private final Map<String, Double> priceMap;

    public PriceCalculator(Map<String, Double> priceMap) {
        this.priceMap = priceMap;
    }

    public double calculateTotal(Order order) {
        double total = 0;
        for (String item : order.getItems()) {
            total += priceMap.getOrDefault(item, 0.0);
        }
        return total;
    }
}
