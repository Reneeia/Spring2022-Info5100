package neu.jia.assignment03;

public class Main {

    public static void main(String[] args) {

        //creat 1 instance of SeattlePoliceDepartment: seattlePolice
        SeattlePoliceDepartment seattlePolice = new SeattlePoliceDepartment();

        //create 4 instances of Person
        Person ada = new Person("Ada", 31);
        Person beta = new Person("Beta", 32);
        Person cathy = new Person("Cathy", 45);
        Person david = new Person("David", 17);


        //Subscribe 4 persons to seattlePolice: Ada, Beta, Cathy, David
        ada.subscribe(seattlePolice);
        beta.subscribe(seattlePolice);
        cathy.subscribe(seattlePolice);
        david.subscribe(seattlePolice);

        //Publish a message from seattlePolice
        seattlePolice.notifyCitizens("Amber Alert 001 !!!");

        //2s
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Unsubscribe a person from the seattlePolice: unsubscribe Beta
        beta.unsubscribe(seattlePolice);

        //2s
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Publish the message again
        seattlePolice.notifyCitizens("Amber Alert 001 has been canceled.");
    }
}
