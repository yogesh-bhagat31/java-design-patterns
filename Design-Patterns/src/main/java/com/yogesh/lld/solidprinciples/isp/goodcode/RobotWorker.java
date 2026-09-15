package com.yogesh.lld.solidprinciples.isp.goodcode;

public class RobotWorker implements Workable {
    private final String id;

    public RobotWorker(String id) {
        this.id = id;
    }

    public void work() {
        System.out.println("Robot-" + id + " is working 24/7");
    }
}
