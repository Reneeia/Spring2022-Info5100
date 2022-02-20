package neu.jia.quiz01;

public class Student extends Person{

    public Student(String name, int age, int id) {
        super(name, age, id);
    }

    public void takeQuiz(String takeQuiz){
        System.out.println("Student take the quiz today.");
    }
}
