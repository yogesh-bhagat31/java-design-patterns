package com.yogesh.lld.solidprinciples.ocp.drawshapeapp.goodcode;

public class Client {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        DrawShape drawShape = new DrawShape();
        drawShape.draw(circle);
        drawShape.draw(square);
        drawShape.draw(triangle);

    }
}
