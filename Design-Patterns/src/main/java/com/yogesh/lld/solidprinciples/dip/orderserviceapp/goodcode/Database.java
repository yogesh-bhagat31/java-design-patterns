package com.yogesh.lld.solidprinciples.dip.orderserviceapp.goodcode;

/**
 * Abstraction that decouples high-level business logic from any specific
 * database technology.
 * <p>
 * Both {@code OrderService} (high-level) and its concrete implementations
 * (low-level) depend on this interface rather than on each other —
 * satisfying both rules of the Dependency Inversion Principle (DIP):
 * <ol>
 *   <li>High-level modules do not depend on low-level modules; both
 *       depend on this abstraction.</li>
 *   <li>This abstraction is generic and technology-neutral — it does not
 *       depend on the internal details of any particular database.</li>
 * </ol>
 */
public interface Database {

    /**
     * Persists the given data to the underlying data store.
     * <p>
     * Implementations decide how and where the data is actually stored;
     * callers of this interface remain unaware of that detail.
     *
     * @param data the data to be saved
     */
    void save(String data);
}
