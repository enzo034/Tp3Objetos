package Tp3Objetos;

public class Cylinder extends Circle
{
    private double height;

    public Cylinder()
    {
        super();
        this.height = 1.0;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume()
    {
        return super.area()*height;
    }

    @Override
    public double area() {
        return 2*Math.PI*radius*height+2*super.area();
    }

    @Override
    public String toString() {
        return "Cylinder[Radius = " + radius +
                ", height = " + height +
                ", volume = " + volume() +
                ", area = " + area();
    }
}
