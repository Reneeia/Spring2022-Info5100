package neu.jia.assignment01;


//Question 5:  Write a program to determine whether the year is a leap year or not.
//Leap Years are any year that can be evenly divided by 4.
// A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.
public class LeapYear {

    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //main method to check whether the input year is leap year
    public static void main(String[] args) {
        LeapYear year = new LeapYear();
        boolean result = year.isLeapYear(2020);
        System.out.println(result);
    }
}
