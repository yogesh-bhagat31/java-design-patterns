package com.yogesh.lld.solidprinciples.dip.orderserviceapp.badcode;

/**
 * Low-level module.
 * <p>
 * Represents a concrete, technology-specific implementation of data
 * persistence (MySQL in this case). It exposes no abstraction — callers
 * must depend on this exact class to use it.
 */
public class MYSQLDatabase {

    /**
     * Persists the given data directly to a MySQL data store.
     *
     * @param data the data to be saved
     */
    public void save(String data) {
        System.out.println("Saving to MYSQL: " + data);
    }
}
