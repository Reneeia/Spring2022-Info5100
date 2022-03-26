package neu.jia.info5100MidTerm.question01;

public class Student {
    public String name;
    public int studentId;
    public double gpa;

    //copy constructor for deep copy
    public Student(Student student) {
        Student sampleStudent = new Student();
        this.name = student.name;
        this.studentId = student.studentId;
        this.gpa = student.gpa;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
