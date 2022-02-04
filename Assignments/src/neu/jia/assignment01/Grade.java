package neu.jia.assignment01;

//Question 8 : Write a program that prompts the user’s grade. Your program should
// display the corresponding meaning of grade as per the following table
//Grade Meaning:A-Excellent B-Good C-Average D Deficient F-Failing
public class Grade {

    public String getGradeCategory(int grade) {
        String category;
        if (grade < 0 || grade > 100) {
            category = "Input Error: You Grade Should Between 0-100!";
        } else if (grade >= 90) {
            category = "A - Excellent";
        } else if (grade >= 80 && grade < 90) {
            category = "B - Good";
        } else if (grade >= 70 && grade < 80) {
            category = "C - Average";
        } else if (grade >= 60 && grade < 70) {
            category = "D - Deficient";
        } else {
            category = "F - Failing";
        }
        return category;
    }

    //Main method to check the grade and its category
    public static void main(String[] args) {
        Grade grade = new Grade();
        String result = grade.getGradeCategory(100);
        System.out.println("You Grade Category is: " + result);
    }
}
