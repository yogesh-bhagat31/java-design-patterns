package com.yogesh.lld.solidprinciples.lsp.badcode;

public class Ostrich implements Bird {
    @Override
    public void eat() {
        System.out.println("Ostrich is eating grass");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}
