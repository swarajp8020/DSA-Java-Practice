package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }

    static void main() {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
