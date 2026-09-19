package com.yogesh.lld.solidprinciples.dip.orderserviceapp.goodcode;


/**
 * Low-level module — MongoDB-specific implementation of {@link Database}.
 * <p>
 * Demonstrates that new storage technologies can be introduced simply by
 * adding a new class that implements {@link Database} — no existing
 * high-level code needs to change (also satisfies the Open/Closed
 * Principle).
 */
 public class MongoDatabase implements Database {

    /**
     * Saves data specifically to a MongoDB data store.
     */
    @Override
    public void save(String data) {
        System.out.println("Saving to mongodb database : " + data);
    }
}
