package Practice.Week13Practice;

public class Jan30Morning {
    public static int rob(int[] nums) {
        int prev1 = 0, prev2 = 0;
        for (int x: nums){
            int curr = Math.max(prev1, prev2 + x);
            prev2 = prev1;
            prev1 = curr;
        } return prev1;
    }
    static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
}
