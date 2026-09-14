package com.yogesh.lld.solidprinciples.lsp.goodcode;

public class Eagle implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Eagle is eating a fish");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is soaring over the mountains");
    }
}
