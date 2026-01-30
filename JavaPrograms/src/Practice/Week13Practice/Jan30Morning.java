package Practice.Week13Practice;

public class Jan30Morning {
    public static int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            if (x < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(x, maxProd * x);
            minProd = Math.min(x, minProd * x);
            ans = Math.max(ans, maxProd);
        } return ans;
    }
    static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxProduct(nums));
    }
    /// house robber
//    public static int rob(int[] nums) {
//        int prev1 = 0, prev2 = 0;
//        for (int x: nums){
//            int curr = Math.max(prev1, prev2 + x);
//            prev2 = prev1;
//            prev1 = curr;
//        } return prev1;
//    }
//    static void main(String[] args) {
//        int[] nums = {2,7,9,3,1};
//        System.out.println(rob(nums));
//    }
}
