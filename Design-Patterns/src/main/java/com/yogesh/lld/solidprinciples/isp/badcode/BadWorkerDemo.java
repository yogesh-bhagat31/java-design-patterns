package com.yogesh.lld.solidprinciples.isp.badcode;

public class BadWorkerDemo {

    public static void main(String[] args) {
        HumanWorker humanWorker = new HumanWorker("Yogesh");
        RobotWorker robotWorker = new RobotWorker("R-111");

        humanWorker.work();
        humanWorker.sleep();
        humanWorker.eat();

        System.out.println("----------------------------");

        robotWorker.work();

        try {
            robotWorker.eat();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            robotWorker.sleep();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
