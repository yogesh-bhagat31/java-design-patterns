package com.yogesh.lld.paymentapp;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@code PaymentService} class manages and processes different payment methods
 * leveraging runtime polymorphism.
 *
 * <h2>Design & Architectural Notes:</h2>
 * <ul>
 *   <li><strong>Reference Security:</strong> The internal collection reference is marked as
 *       {@code final} to ensure it cannot be accidentally re-assigned after initialization,
 *       guaranteeing that the reference remains secure and points to the same object throughout its lifecycle.</li>
 *   <li><strong>Initialization Strategy:</strong>
 *       <ul>
 *         <li>For lightweight or standalone programs, direct field initialization
 *             (e.g., {@code new HashMap<>()}) is simple, clean, and effective.</li>
 *         <li>For large enterprise applications utilizing Dependency Injection (such as Spring Boot),
 *             constructor injection becomes the industry standard for better testability and flexibility.</li>
 *       </ul>
 *   </li>
 * </ul>
 *
 * @author Yogesh Bhagat
 * @version 1.0
 * @since 2026-08-31
 */
public class PaymentService {

    // We have to store the payment and process the payment
    private final Map<String, PaymentMethod> ps;

    public PaymentService() {
        ps = new HashMap<>();
    }

    public void addPayment(String name, PaymentMethod pm) {
        ps.put(name, pm);
    }

    public void makePayment(String name) {
        PaymentMethod pm = ps.get(name);
        pm.pay(); //Runtime polymorphism
    }
}
