package Practice.WeekdayPractice;
/// PHASE A (Warm-up 20–30 mins)
///
/// PHASE B (Prime muscle 30–40 mins)
/// ✔ Longest Sum ≤ X
/// ✔ Longest Sum = X
/// ✔ Longest Unique Subarray
/// ✔ Longest Subarray with Exactly K Distinct  ← new checkpoint
public class Nov28Morning {
    /// ✔ Max Sum K
//    public static void main(String[] args) {
//        int[] arr = {3,5,2,1,4,6};
//        int k = 3;
//        int res = maxSumSubArrayK(arr, k);
//        System.out.println(res);
//    }
//    static int maxSumSubArrayK(int[] arr, int k){
//        int maxSum = 0;
//        int windowSum = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        maxSum = windowSum;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i] - arr[i-k];
//            maxSum = Math.max(maxSum, windowSum);
//        }
//        return maxSum;
//    }
///// ✔ Min Sum K
//public static void main(String[] args) {
//    int[] arr = {3,5,2,1,4,6};
//    int k = 3;
//    int res = minSumSumSubArrayK(arr, k);
//    System.out.println(res);
//}
//    static int minSumSumSubArrayK(int[] arr, int k){
//        int minSum = 0;
//        int windowSum = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        minSum = windowSum;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i] - arr[i-k];
//            minSum = Math.min(minSum, windowSum);
//        }
//        return minSum;
//    }

    /// ✔ Count K divisible by 2 or 3
public static void main(String[] args) {
    int[] arr = {3,5,2,1,4,6};
    int k = 3;
    int res = countSubarrayDivK(arr, k);
    System.out.println(res);
}
    static int countSubarrayDivK(int[] arr, int k) {
        int count = 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        if (windowSum%2==0) count++;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i]-arr[i-k];
            if (windowSum%2==0)count++;
        }
        return count;
    }
}
