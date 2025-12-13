package Practice.Week7Practice;

public class Dec13Morning {
    /// CountSubarraysWithSumX
    static void main() {
        int[] arr = {3,1,4,2,5,6};
        int x = 3;
        int res = countSubarrayWithSumX(arr,x);
        System.out.println(res);
    }
    static int countSubarrayWithSumX(int[] arr, int x){
        int left = 0;
        int sum = 0;
        int count = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum>x){
                sum -= arr[left];
                left++;
            }
            if (sum == x) count++;
        }
        return count;
    }

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
