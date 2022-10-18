package lesson6.bt1;

public class Circle {
    final double PI = 3.14;
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * PI;
    }
    @Override
    public String toString() {
        double area = getArea();
        return "Circle{" +
                "radius = " + this.radius +
                ", color = '" + this.color + '\'' +
                ", area = " + area +
                '}';
    }
}
