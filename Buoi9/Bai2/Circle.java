package Bai2;

public class Circle implements IShape{
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (radius*radius);
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI * radius;
    }
}
