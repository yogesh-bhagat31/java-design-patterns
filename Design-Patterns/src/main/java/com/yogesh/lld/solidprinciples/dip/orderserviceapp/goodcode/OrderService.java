package com.yogesh.lld.solidprinciples.dip.orderserviceapp.goodcode;

/**
 * High-level module — contains core business logic for placing orders.
 * <p>
 * <b>DIP-compliant design:</b> this class depends only on the
 * {@link Database} abstraction, never on a concrete implementation such
 * as {@link MySQLDatabase} or {@link MongoDatabase}.
 * <p>
 * Benefits of this design over the tightly-coupled version:
 * <ul>
 *   <li><b>Swappable dependencies</b> — switching the underlying
 *       database requires passing a different {@link Database}
 *       implementation to the constructor; this class itself never
 *       changes.</li>
 *   <li><b>Testability</b> — a test-only implementation such as
 *       {@code FakeDatabase implements Database} can be constructed and
 *       injected in unit tests, removing the need for a real database
 *       connection entirely.</li>
 *   <li><b>Inversion of ownership</b> — the concrete dependency is
 *       created outside this class and supplied via the constructor,
 *       rather than this class creating it internally with {@code new}.</li>
 * </ul>
 *
 * @see Database
 */
public class OrderService {
    private Database database;

    public OrderService(Database database) {
        this.database = database;
    }


    /**
     * Places an order and persists it using the injected {@link Database}
     * implementation.
     * <p>
     * Because {@code database} is an abstraction supplied externally,
     * this method's behavior can be fully tested in isolation by
     * injecting a test double in place of a real database.
     *
     * @param orderData the order data to be persisted
     */
    public void placeOrder(String orderData) {
        database.save(orderData);
        System.out.println("Order Placed Successfully: " + orderData);
    }
}
