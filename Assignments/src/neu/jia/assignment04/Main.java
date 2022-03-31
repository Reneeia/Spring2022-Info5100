package neu.jia.assignment04;

public class Main {
    public static void main(String[] args) {
        ThreadSafeQueue<String> queue = new ThreadSafeQueue<>();
        //add "AAA","BBB","CCC" into the queue
        queue.add("AAA");
        queue.add("BBB");
        queue.add("CCC");

        //print out the queue
        System.out.print("The Initial Queue is : ");
        while(!queue.isEmpty()){
            System.out.print(queue.peek() + "->");
            queue.remove();
        }
        //check whether the queue is empty now
        System.out.println();
        System.out.println("Is the Queue Empty ? " + queue.isEmpty());
    }
}
