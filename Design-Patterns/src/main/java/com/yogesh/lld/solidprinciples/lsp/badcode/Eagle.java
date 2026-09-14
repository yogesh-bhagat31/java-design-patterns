package com.yogesh.lld.solidprinciples.lsp.badcode;

public class Eagle implements Bird{
    @Override
    public void eat() {
        System.out.println("Eagle is eating a fish");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is soaring over the mountains");
    }
}
