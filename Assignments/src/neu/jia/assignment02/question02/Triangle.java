package neu.jia.assignment02.question02;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(String name, String color, double side) {
        super(name, color);
        this.base = side;
        this.height = (Math.sqrt(3) / 2.0) * base;
    }

    public Triangle(double side) {
        this.base = side;
        this.height = (Math.sqrt(3) / 2.0) * base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public double getPerimeter() {
        return base * 3;
    }
}
