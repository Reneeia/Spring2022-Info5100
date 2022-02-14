package neu.jia.assignment02.question03;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(){

    }

    public Rectangle(double length, double width) {
        this.name = "Rectangle";
        this.length = length;
        this.width = width;
    }

    @Override
    public void computeArea() {
        System.out.println("The Area is: " + length * width);
    }

    @Override
    public void computePerimeter() {
        System.out.println("The Perimeter is: " + ((length * 2) + (width * 2)));
    }
}
