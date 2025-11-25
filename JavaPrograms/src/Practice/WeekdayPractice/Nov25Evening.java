package Practice.WeekdayPractice;

/// Minimum subarray sum of size K
/// Longest subarray sum ≤ X
/// Longest unique subarray
public class Nov25Evening {
    /// Subarrays of size K divisible by 3
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,2,1};
        int k = 3;
        int res =countEvenSubArrayK(arr, k);
        System.out.println(res);
    }
    static int countEvenSubArrayK(int[] arr, int k){
        int count = 0;
        int windowSum= 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        if (windowSum%3 == 0) count++;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i-k];
            if (windowSum%3==0)count++;
        }
        return count;
    }

/// Count even sum subarrays of size K
//public static void main(String[] args) {
//    int[] arr = {2,1,4,5,2,1};
//    int k = 3;
//    int res =countEvenSubArrayK(arr, k);
//    System.out.println(res);
//}
//static int countEvenSubArrayK(int[] arr, int k){
//    int count = 0;
//    int windowSum= 0;
//    for (int i = 0; i < k; i++) {
//        windowSum += arr[i];
//    }
//    if (windowSum%2 == 0) count++;
//    for (int i = k; i < arr.length; i++) {
//        windowSum += arr[i] - arr[i-k];
//        if (windowSum%2==0)count++;
//    }
//    return count;
//}

    /// Max sum subarray of size K
//    public static void main(String[] args) {
//        int[] arr = {2,1,4,5,2,1};
//        int k = 3;
//        int res =maxSumSubArrayK(arr, k);
//        System.out.println(res);
//    }
//    static int maxSumSubArrayK(int[] arr, int k){
//        int windowSum = 0;
//        int maxSum = 0;
//        for (int i = 0; i < k; i++) {
//            windowSum += arr[i];
//        }
//        maxSum = windowSum;
//        for (int i = k; i < arr.length; i++) {
//            windowSum += arr[i] - arr[i-k];
//            maxSum = Math.max(windowSum,maxSum);
//        }
//        return maxSum;
//    }
}
