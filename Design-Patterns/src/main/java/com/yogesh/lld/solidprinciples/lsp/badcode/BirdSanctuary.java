package com.yogesh.lld.solidprinciples.lsp.badcode;

public class BirdSanctuary {

    public void feed(Bird bird) {
        bird.eat();
    }

    public void makeItFly(Bird bird) {
        bird.fly();// Here every bird can not fly
    }
}
