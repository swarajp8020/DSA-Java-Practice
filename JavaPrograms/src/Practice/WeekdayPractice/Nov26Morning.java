package Practice.WeekdayPractice;

import slidingWindows.LongestSubArraySumX;
import slidingWindows.LongestUniqueSubarray;

public class Nov26Morning {
        /// Longest Subarray Sum ≤ X
//public static void main(String[] args) {
//    int[] arr = {4,2,1,5,1,51,2};
//    int x = 7;
//    int res = LongestSubArraySumX(arr, x);
//    System.out.println(res);
//}
//    static int LongestSubArraySumX(int[] arr, int x){
//    int windowSum = 0;
//    int left = 0;
//    int maxLen = 0;
//        for (int right = 0; right < arr.length; right++) {
//            windowSum += arr[right];
//           while (windowSum>x){
//                windowSum -= arr[left];
//                left++;
//            }
//            maxLen = Math.max(maxLen, right-left+1);
//        }
//        return maxLen;
//}

/// Longest Unique Subarray (no peek)

//public static void main(String[] args) {
//    int[] arr = {4,2,1,5,1,51,2};
//    int k = 3;
//    int res = LongestUniqueSubarray(arr, k);
//    System.out.println(res);
//}
//static int LongestUniqueSubarray(int[] arr, int k){
//    int[] freq = new int[1001];
//    int maxLen = 0;
//    int left = 0;
//    for (int right = 0; right < arr.length; right++) {
//        freq[arr[right]]++;
//        while (freq[arr[right]]>1){
//            freq[arr[left]]--;
//            left++;
//        }
//        maxLen = Math.max(maxLen, right-left+1);
//    }
//    return maxLen;
//}


//    Longest Subarray Sum ≤ X
//public static void main(String[] args) {
//    int[] arr = {4,2,1,5,1,51,2};
//    int x = 7;
//    int res = LongestSubArraySumX(arr, x);
//    System.out.println(res);
//}
//static int LongestSubArraySumX(int[] arr, int x){
//    int windowSum = 0;
//    int left = 0;
//    int maxLen = 0;
//    for (int right = 0; right < arr.length; right++) {
//        windowSum += arr[right];
//        while (windowSum>x){
//            windowSum -= arr[left];
//            left++;
//        }
//        maxLen = Math.max(maxLen, right-left+1);
//    }
//    return maxLen;
//}

//    Longest Unique Subarray (no peek)
//    public static void main(String[] args) {
//        int[] arr = {4,2,1,5,1,51,2};
//        int k = 3;
//        int res = longestUniqueSubarray(arr, k);
//        System.out.println(res);
//    }
//    static int longestUniqueSubarray(int[] arr, int k){
//        int[] freq = new int[1001];
//        int left = 0;
//        int maxLen = 0;
//        for (int right = 0; right < k; right++) {
//            freq[arr[right]]++;
//            while (freq[arr[right]]>1){
//                freq[arr[left]]--;
//                left++;
//            }
//            maxLen = Math.max(maxLen, right-left+1);
//        }
//        return maxLen;
//    }
}
