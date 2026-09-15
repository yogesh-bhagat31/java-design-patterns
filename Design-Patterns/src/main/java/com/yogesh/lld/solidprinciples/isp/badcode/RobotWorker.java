package com.yogesh.lld.solidprinciples.isp.badcode;

public class RobotWorker implements Worker {
    private final String robotID;

    public RobotWorker(String robotID) {
        this.robotID = robotID;
    }

    @Override
    public void work() {
        System.out.println("Robot-" + robotID + " is working 24/7");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot doesn't eat");
    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException("Robot doesn't sleep");

    }
}
