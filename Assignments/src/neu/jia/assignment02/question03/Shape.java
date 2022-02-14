package neu.jia.assignment02.question03;

public class Shape {
    String name;
    double area;
    double perimeter;

    public Shape() {

    }

    public void computeArea() {
        System.out.println("The Area is: " + area);
    }

    public void computePerimeter() {
        System.out.println("The Perimeter is: " + perimeter);
    }

    public void display() {
        System.out.println("Shape : " + name);
        computeArea();
        computePerimeter();
    }
}
