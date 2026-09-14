package com.yogesh.lld.solidprinciples.lsp.goodcode;

public class Sparrow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating seeds");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying high in the sky");
    }
}
