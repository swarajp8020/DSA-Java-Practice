package Practice.Week12Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dec22Morning {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x:nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a,b) -> freq.get(b) - freq.get(a)
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
//    public static boolean containsDuplicate(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int x: nums) {
//            if (set.contains(x)) return true;
//            set.add(x);
//        } return false;
//    }
//
//    static void main() {
//        int[] nums = {1,2,3,1};
//        System.out.println(containsDuplicate(nums));
//    }
//    public static int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement)) {
//                return new int[]{map.get(complement), i};
//            }
//            map.put(nums[i], i);
//        }
//        return new int[]{-1,-1};
//    }
//
//    static void main() {
//        int[] nums = {2,7,11,15};
//        int target = 9;
//        System.out.println(Arrays.toString(twoSum(nums, target)));
//    }
}
