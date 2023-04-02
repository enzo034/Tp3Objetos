package Tp3Objetos;

public class Circle extends Figure
{
    protected double radius;

    public Circle()
    {
        super();
        this.radius = 1.0;
    }

    public Circle(String color, double radius)
    {
        this.color = color;
        this.radius = radius;
    }

    public void setRadio(double radius) {
        this.radius = radius;
    }

    public double area()
    {
        return Math.PI*Math.pow(this.radius, 2);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return  "Circle[Radius = " + radius +
                ", color = " + color +
                ", area = " + area();
    }
}