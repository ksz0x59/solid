package ocp.bad;

public class Circle extends Shape
{
    private final double radius;

    public Circle(double radius)
    {
        shapeType = ShapeType.CIRCLE;
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }
}
