package com.yogesh.lld.solidprinciples.dip.orderserviceapp.goodcode;

/**
 * Low-level module — MySQL-specific implementation of {@link Database}.
 * <p>
 * Depends on the {@link Database} abstraction rather than exposing its
 * own API for callers to adapt to. Can be swapped for any other
 * {@link Database} implementation without affecting high-level code.
 */
public class MySQLDatabase implements Database {

    /**
     * Saves data specifically to a MySQL data store.
     */
    @Override
    public void save(String data) {
        System.out.println("Saving to mysql database : " + data);
    }
}
