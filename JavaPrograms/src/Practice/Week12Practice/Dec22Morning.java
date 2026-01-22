package Practice.Week12Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Dec22Morning {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        } return false;
    }

    static void main() {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
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
