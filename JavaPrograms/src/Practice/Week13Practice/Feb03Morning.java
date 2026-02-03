package Practice.Week13Practice;

public class Feb03Morning {
    public static boolean canJump(int[] nums) {
        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) return false;
            farthest = Math.max(farthest, i + nums[i]);
        }
        return true;
    }
    static void main() {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
