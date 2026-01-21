package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
//    public static int[] twoSum(int[] nums, int target) {
//        for(int i = 0; i<nums.length; i++){
//            for(int j = i+1; j<nums.length;  j++){
//                if( nums[i]+nums[j]== target ){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{};
//    }
    public static int[] twoSum(int[] nums, int target) {
    // Map to store value -> index
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        // If we found the "other half" of the pair in our history
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        // Otherwise, add current number to history
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No solution found");
}
    static void main() {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
