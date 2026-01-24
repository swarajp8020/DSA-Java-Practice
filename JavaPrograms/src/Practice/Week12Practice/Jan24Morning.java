package Practice.Week12Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Jan24Morning {

    /// TopKFrequentElements
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x:nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a,b)->freq.get(b) - freq.get(a)
        );
        pq.addAll(freq.keySet());
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
    static void main() {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
    /// BestTimeToBuyAndSellStock
//    public static int maxProfit(int[] prices) {
//        int minPrices = Integer.MAX_VALUE;
//        int maxProfit = 0;
//        for (int p:prices) {
//            minPrices = Math.min(minPrices, p);
//            maxProfit = Math.max(maxProfit, p - minPrices);
//        }
//        return maxProfit;
//    }
//    static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
//        System.out.println(maxProfit(prices));
//    }
}
