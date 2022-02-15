package neu.jia.assignment02.question02;

public class Rhombus extends Shape {

    private double diagonal1;
    private double diagonal2;


    public Rhombus(double d1, double d2) {
        this.name = "Rhombus";
        this.diagonal1 = d1;
        this.diagonal2 = d2;
    }

    public Rhombus(double d1) {
        this.name = "Rhombus";
        this.diagonal1 = d1;
        this.diagonal2 = d1;
    }

    @Override
    public double getArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public double getPerimeter() {
        return (Math.sqrt(diagonal1 * diagonal1 + diagonal2 * diagonal2)) * 2;
    }

}
