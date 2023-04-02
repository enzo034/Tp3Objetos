package Tp3Objetos;

public class Square extends Rectangle
{

    public Square(double side, String color)
    {
        this.height = this.width = side;
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public String toString() {
        return  "Square[Sides = " + height +
                ", area = " + area() +
                ", perimeter = " + perimeter();
    }
}
