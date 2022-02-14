package neu.jia.assignment02.question03;

public class Circle extends Shape {
    double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.name = "Circle";
        this.radius = radius;
    }

    @Override
    public void computeArea() {
        System.out.println("The Area is: " + Math.PI * radius * radius);
    }

    @Override
    public void computePerimeter() {
        System.out.println("The Perimeter is: " + Math.PI * radius * 2);
    }
}
