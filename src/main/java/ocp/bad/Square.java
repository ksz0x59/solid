package ocp.bad;

public class Square extends Shape
{
    private final double side;

    public Square(double side)
    {
        shapeType = ShapeType.SQUARE;
        this.side = side;
    }

    public double getSide()
    {
        return side;
    }
}
