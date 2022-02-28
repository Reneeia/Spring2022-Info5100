package neu.jia.assignment03;

public class Person {
    private String name;
    private int age;

    //constructor with 2 parameters: name, age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Method subscribe take SeattlePoliceDepartment as argument
    //to subscribe
    public void subscribe(SeattlePoliceDepartment seattlePolice) {
        if (!seattlePolice.people.contains(this)) {
            seattlePolice.people.add(this);
        }
    }

    //Method unsubscribe take SeattlePoliceDepartment as argument
    //to unsubscribe
    public void unsubscribe(SeattlePoliceDepartment seattlePolice) {
        seattlePolice.people.remove(this);
    }

    //Method getNotification take SeattlePoliceDepartment as argument
    //Notification contains: SeattlePoliceDepartment name, messgae, and subscriber's name
    public void getNotification(SeattlePoliceDepartment seattlePolice) {
        System.out.println("****************************************");
        System.out.println("Notice From Seattle Police ： " + seattlePolice.getNotification());
        System.out.println("To : " + this.getName());
        System.out.println("****************************************");
    }
}
