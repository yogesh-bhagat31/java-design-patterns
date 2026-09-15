package com.yogesh.lld.solidprinciples.isp.goodcode;

public class HumanWorker implements Workable, Sleepable, Eatable {

    private final String name;

    public HumanWorker(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " (Human) is working");
    }

    public void eat() {
        System.out.println(name + " (Human) is eating lunch");
    }

    public void sleep() {
        System.out.println(name + " (Human) is sleeping");
    }
}
