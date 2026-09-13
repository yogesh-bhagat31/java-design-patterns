package com.yogesh.lld.solidprinciples.ocp.paymentapp.goodcode;

/**
 * Processes payments using different payment methods.
 *
 * <p>This class follows the <b>Open/Closed Principle (OCP)</b>:
 * it is open for extension but closed for modification. New payment
 * methods can be added by implementing {@link PaymentMethod}
 * without modifying this class.</p>
 *
 * <p>The class depends on the {@link PaymentMethod} abstraction
 * rather than concrete payment method implementations.</p>
 */
public class PaymentProcessor {

    /**
     * Processes a payment using the specified payment method.
     *
     * @param paymentMethod the payment method to use
     * @param amount the amount to be paid
     */
    public void paymentProcess(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
