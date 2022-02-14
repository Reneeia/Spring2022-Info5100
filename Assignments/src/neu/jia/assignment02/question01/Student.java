package neu.jia.assignment02.question01;

public class Student {
    private int rollNumber;
    private String name;

    //constructor with 2 fields
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    //constructor using copy constructor
    public Student(Student student) {
        this.rollNumber = student.rollNumber;
        this.name = student.name;
    }

    //getters and setters
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //method to get print roll number
    public String printRoll() {
        return String.valueOf(getRollNumber());
    }

    //method to print name
    public String printName() {
        return getName();
    }
}
