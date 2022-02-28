package neu.jia.assignment03;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    ArrayList<Person> people;
    String notification;

    //constructor, default initiate with an arraylist of people
    public SeattlePoliceDepartment() {
        this.people = new ArrayList<>();
    }

    //getter and setter
    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    //Method to notifyCitizens take String as argument
    //will publish any notifications
    public void notifyCitizens(String notification) {
        this.notification = notification;
        for (Person person : people) {
            person.getNotification(this);
        }
    }
}
