package com.yogesh.lld.solidprinciples.ocp.drawshapeapp.badcode;

/**
 * Responsible for drawing different types of shapes.
 *
 * <p>This class violates the <b>Open/Closed Principle (OCP)</b>
 * because adding a new shape requires modifying the existing
 * {@code draw()} method.</p>
 */
public class DrawShape {

    /**
     * Identifies the type of the given object and draws it
     * if it is a supported shape.
     *
     * @param obj the object representing a shape to be drawn
     * @throws RuntimeException if the given object is not a supported shape
     */
    public void draw(Object obj) {

        if (obj instanceof Circle) {
            ((Circle) obj).draw();
        } else if (obj instanceof Square) {
            ((Square) obj).draw();
        } else if (obj instanceof Triangle) {
            ((Triangle) obj).draw();
        } else {
            throw new RuntimeException("invalid shape found please pass right shape");
        }

    }
}
