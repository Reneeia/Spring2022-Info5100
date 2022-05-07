package neu.jia.info5100Final.question05;

import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {

        //create a priority queue to store nums
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);

            //if size of pq > k, poll the num out
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
    }
}
