package Practice.Week14Practice;

import java.util.PriorityQueue;

public class Feb05Morning {
    //KthLargestElement using Queue
    public static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num: arr) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }return minHeap.peek();
    }
    static void main() {
        int[] arr = {8,5,7,2,9,3};
        int k = 3;
        System.out.println(findKthLargest(arr, k));
    }
}
