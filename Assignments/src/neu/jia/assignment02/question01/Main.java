package neu.jia.assignment02.question01;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(101, "ABC");
        System.out.println("Roll number of the first Student: " + student1.printRoll());
        System.out.println("Name of the first Student:" + student1.printName());

        Student student2 = new Student(student1);
        System.out.println("Roll number of the first Student: " + student2.printRoll());
        System.out.println("Name of the first Student:" + student2.printName());
    }
}
