package Practice.WeekdayPractice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Dec19Morning {
    static class sol{
        public int[] slidingWindowMax(int[] nums, int k){
            if (nums.length == 0 || k == 0) return new int[0];
            Deque<Integer> dq = new ArrayDeque<>();
            int[] res = new int[nums.length - k + 1];
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                    dq.pollFirst();
                }
                while (!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                    dq.pollLast();
                }
                dq.offerLast(i);
                if (i >= k - 1) {
                    res[index++] = nums[dq.peekFirst()];
                }
            }
            return res;
        }
    }
    static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k  = 3;
        sol s = new sol();
        System.out.println(Arrays.toString(s.slidingWindowMax(nums,k)));
    }
}
