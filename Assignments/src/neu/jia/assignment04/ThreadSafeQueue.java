package neu.jia.assignment04;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadSafeQueue<T> {
    private Queue<T> threadSafeQueue;
    private Object objLock = new Object();

    //constructor
    public ThreadSafeQueue() {
        threadSafeQueue = new LinkedList<>();
    }

    public void add(T data) {
        synchronized (objLock) {
            threadSafeQueue.offer(data);
        }
    }

    public T remove() {
        synchronized (objLock) {
            return threadSafeQueue.poll();
        }
    }

    public T peek() {
        synchronized (objLock) {
            return threadSafeQueue.peek();
        }
    }

    public boolean isEmpty() {
        synchronized (objLock) {
            return threadSafeQueue.size() == 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(T s : threadSafeQueue){
            sb.append(s);
            sb.append("->");
        }
        return sb.toString();
    }
}
