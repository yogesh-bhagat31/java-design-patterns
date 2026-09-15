package com.yogesh.lld.solidprinciples.isp.goodcode;

public class GoodWorkerDemo {

    public static void main(String[] args) {
        HumanWorker human = new HumanWorker("Yogesh");
        RobotWorker robot = new RobotWorker("R2D2");

        human.work();
        human.eat();
        human.sleep();

        System.out.println("---------------------");

        robot.work();

        System.out.println("---------------------");
    }
}
