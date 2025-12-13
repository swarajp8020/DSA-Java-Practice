package Practice.Week7Practice;

public class Dec13Morning {
    /// MaxSumSubarrayK
    static void main() {
        int[] arr = {3,5,1,5,1,2};
        int k = 3;
        System.out.println(maxSum(arr, k));
    }
    static int maxSum(int[] arr, int k){
        int maxSum = 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
    /// CountSubarraysWithSumX
//    static void main() {
//        int[] arr = {3,1,4,2,5,6};
//        int x = 3;
//        int res = countSubarrayWithSumX(arr,x);
//        System.out.println(res);
//    }
//    static int countSubarrayWithSumX(int[] arr, int x){
//        int left = 0;
//        int sum = 0;
//        int count = 0;
//        for (int right = 0; right < arr.length; right++) {
//            sum += arr[right];
//            while (sum>x){
//                sum -= arr[left];
//                left++;
//            }
//            if (sum == x) count++;
//        }
//        return count;
//    }

    /// LongestUniqueSubarray
//    static void main() {
//        int[] arr = {1,2,3,1,2,3,4};
//        System.out.println(longestUnique(arr));
//    }
//    static int longestUnique(int[] arr){
//        int[] temp = new int[1001];
//        int left = 0;
//        int maxLen = 0;
//        for (int right = 0; right < arr.length; right++) {
//            temp[arr[right]]++;
//            if (temp[arr[right]] > 1) {
//                temp[arr[left]]--;
//                left++;
//            }
//            maxLen = Math.max(maxLen,right-left+1);
//        }
//        return maxLen;
//    }
}
