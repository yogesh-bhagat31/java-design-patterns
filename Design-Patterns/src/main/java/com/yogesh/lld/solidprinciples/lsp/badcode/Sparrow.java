package com.yogesh.lld.solidprinciples.lsp.badcode;

public class Sparrow implements Bird{
    @Override
    public void eat() {
        System.out.println("Sparrow is eating seeds");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying high in the sky");
    }
}
