package neu.jia.info5100MidTerm.question01;

public class Main {
    public static void main(String[] args) {
        Student sampleStudent = new Student();
        // shallow copy
        Student shallowCopy = sampleStudent;
        // deep copy
        Student deepCopy = new Student(sampleStudent);

        System.out.println("Original Student GPA is default to 4.0");
        // change originalStudent
        System.out.println("Change Original Student GPA to 3.0");
        sampleStudent.setGpa(3.0);

        System.out.println("Original GPA: " + sampleStudent.getGpa());
        System.out.println("Shallow Copy GPA (same as original): " + shallowCopy.getGpa());
        System.out.println("DeepCopy GPA (should not change): " + deepCopy.getGpa());
    }
}
