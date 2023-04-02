package Tp3Objetos;
public class Rectangle extends Figure
{
    protected double height;
    protected double width;

    public Rectangle()
    {
        super();
        this.height = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double height, double width, String color)
    {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }

    @Override
    public double perimeter() {
        return height*2+width*2;
    }

    @Override
    public double area() {
        return height*width;
    }

    @Override
    public String toString() {
        return "Rectangulo[Height = " + height +
                ", width = " + width +
                ", perimeter = " + perimeter() +
                ", area = " + area() + "]";
    }
}