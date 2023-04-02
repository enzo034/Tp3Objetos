package Tp3Objetos;

public abstract class Figure
{
    protected String color;

    public Figure()
    {
        this.color = "Red";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double perimeter();
    public abstract double area();

}