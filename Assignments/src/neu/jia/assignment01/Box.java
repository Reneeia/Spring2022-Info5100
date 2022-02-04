package neu.jia.assignment01;

public class Box {
    private double width;
    private double height;
    private double depth;

    //Constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //method to calculate box volume
    public double getBoxVolume() {
        double boxVolume = this.width * this.height * this.depth;
        return boxVolume;
    }

    //main method to check the box volume calculate
    public static void main(String[] args) {
        Box box = new Box(2.0, 3.0, 4.0);
        double boxVolume = box.getBoxVolume();
        System.out.println("The Box Volume is : " + boxVolume);
    }
}
