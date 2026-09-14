package com.yogesh.lld.solidprinciples.lsp.goodcode;

public class BirdSanctuary {

    public void feed(Bird bird) {
        bird.eat();
    }

    public void makeItFly(FlyingBird flyingBird) {
        flyingBird.fly();// Here every bird can not fly
    }
}
