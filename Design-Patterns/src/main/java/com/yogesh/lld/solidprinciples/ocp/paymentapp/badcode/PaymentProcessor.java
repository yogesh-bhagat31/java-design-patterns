package com.yogesh.lld.solidprinciples.ocp.paymentapp.badcode;

/**
 * Processes payments using different payment methods.
 *
 * <p>This class violates the <b>Open/Closed Principle (OCP)</b>
 * because adding a new payment method requires modifying the
 * existing {@code processPayment()} method.</p>
 *
 * <p>Each new payment method introduces an additional conditional
 * branch, making the class harder to maintain and extend.</p>
 */
public class PaymentProcessor {

    /**
     * Processes a payment using the specified payment method.
     *
     * @param paymentMethod the payment method to use
     * @param amount the amount to be paid
     * @throws IllegalArgumentException if the payment method is invalid
     */
    public void processPayment(String paymentMethod, double amount) {
        if (paymentMethod.equals("CreditCard")) {
            System.out.println("Making payment via credit card : " + amount);
        } else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Making payment via DebitCard : " + amount);
        } else if (paymentMethod.equals("Paypal")) {
            System.out.println("Making payment via paypal : " + amount);
        } else {
            throw new IllegalArgumentException("Invalid payment method");
        }
    }
}
