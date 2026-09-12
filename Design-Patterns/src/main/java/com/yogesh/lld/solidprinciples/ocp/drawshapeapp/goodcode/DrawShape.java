package com.yogesh.lld.solidprinciples.ocp.drawshapeapp.goodcode;

/**
 * Responsible for drawing a given {@link Shape}.
 *
 * <p>This class follows the <b>Open/Closed Principle (OCP)</b>:
 * it is open for extension but closed for modification. New shapes
 * can be introduced by implementing or extending {@link Shape}
 * without requiring any changes to this class.</p>
 *
 * <p>The {@code DrawShape} class depends on the {@link Shape}
 * abstraction rather than a concrete shape implementation. This
 * allows it to work with different types of shapes in a flexible
 * and extensible manner.</p>
 */
public class DrawShape {

    /**
     * Draws the specified shape.
     *
     * @param shape the shape to be drawn
     */
    public void draw(Shape shape) {
        shape.draw();
    }
}
