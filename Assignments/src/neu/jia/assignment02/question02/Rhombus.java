package neu.jia.assignment02.question02;

public class Rhombus extends Shape {

    private double diagonal1;
    private double diagonal2;


    public Rhombus(double d1, double d2) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
    }

    public Rhombus(double d1) {
        this.diagonal1 = d1;
    }

    @Override
    public double getArea() {
        double height = (Math.sqrt(3) / 2.0) * diagonal1;
        return diagonal1 * height;
    }

    @Override
    public double getPerimeter() {
        return diagonal1 * 2 + diagonal2 * 2;
    }

}
