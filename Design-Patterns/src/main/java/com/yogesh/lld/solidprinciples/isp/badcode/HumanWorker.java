package com.yogesh.lld.solidprinciples.isp.badcode;

public class HumanWorker implements Worker {
    private final String name;

    public HumanWorker(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + " (Human) is working");
    }

    @Override
    public void eat() {
        System.out.println(name + " (Human) is eating");
    }

    @Override
    public void sleep() {
        System.out.println(name + " (Human) is sleeping");
    }
}
