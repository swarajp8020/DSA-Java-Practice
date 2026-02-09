package Practice.Week15Practice;

import java.util.PriorityQueue;

public class Dec09Morning {
    //Kth Largest Element in an Array
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num: nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        } return minHeap.peek();
    }

    static void main(String[] args) {
        int[] arr = {8,5,7,2,9,3};
        int k = 3;
        System.out.println(findKthLargest(arr, k));
    }
}
