package neu.jia.assignment04;

public class Main {
    public static void main(String[] args) {
        ThreadSafeQueue<String> queue = new ThreadSafeQueue<>();
        //add "AAA","BBB","CCC","DDD" into the queue
        System.out.println("===== Start Add =====");
        System.out.println("Ops : Add 'AAA'");
        queue.add("AAA");
        System.out.println("The Queue is : " + queue);
        System.out.println("Ops : Add 'BBB'");
        queue.add("BBB");
        System.out.println("The Queue is : " + queue);
        System.out.println("Ops : Add 'CCC'");
        queue.add("CCC");
        System.out.println("The Queue is : " + queue);
        System.out.println("Ops : Add 'DDD'");
        queue.add("DDD");
        System.out.println("The Queue is : " + queue);

        //check whether the queue is empty before .remove
        System.out.println("Is the Queue Empty ? " + queue.isEmpty());

        System.out.println("===== Start Remove =====");
        while(!queue.isEmpty()){
            System.out.println("Ops : Remove");
            queue.remove();
            System.out.println("The Queue is : " + queue);
        }
        //check whether the queue is empty after .remove
        System.out.println("=====After Remove All=====");
        System.out.println("The Queue is : " + queue);
        System.out.println("Is the Queue Empty ? " + queue.isEmpty());
    }
}
