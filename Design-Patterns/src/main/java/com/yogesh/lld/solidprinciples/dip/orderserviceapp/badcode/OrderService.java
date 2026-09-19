package com.yogesh.lld.solidprinciples.dip.orderserviceapp.badcode;

/**
 * High-level module — contains core business logic for placing orders.
 * <p>
 * <b>Dependency Inversion Principle (DIP) violation:</b> this class
 * depends directly on the concrete low-level class {MySQLDatabase}
 * instead of depending on an abstraction. It also instantiates its own
 * dependency internally via {@code new}, rather than having it injected.
 * <p>
 * Consequences of this design:
 * <ul>
 *   <li><b>Tight coupling</b> — {@code OrderService} is hard-wired to
 *       {MySQLDatabase}. Switching to PostgreSQL or MongoDB would
 *       require modifying this class directly, even though its business
 *       logic has not changed.</li>
 *   <li><b>Poor testability</b> — because {MySQLDatabase} is
 *       instantiated inline, it cannot be replaced with a mock or fake
 *       in unit tests. Every test exercising {@code placeOrder} would
 *       require a real MySQL connection.</li>
 *   <li><b>Ownership of object creation</b> — a high-level module should
 *       never be responsible for constructing its own low-level
 *       dependencies. The presence of {@code new SomeLowLevelClass()}
 *       inside a high-level class is a strong indicator of a DIP
 *       violation.</li>
 * </ul>
 *
 * @seeMySQLDatabase
 */
public class OrderService {

    /**
     * Hardcoded, concrete dependency — violates DIP by binding directly
     * to a low-level implementation instead of an abstraction.
     */
    private MYSQLDatabase database = new MYSQLDatabase();


    /**
     * Places an order and persists it using the underlying database.
     * <p>
     * Because {@code database} is a concrete, internally-created
     * dependency, this method's behavior cannot be isolated from
     * {@MySQLDatabase} during testing.
     *
     * @param orderData the order data to be persisted
     */
    public void placeOrder(String orderData) {
        database.save(orderData);
        System.out.println("Order placed successfully");
    }
}
