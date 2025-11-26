package Practice.WeekdayPractice;

public class Nov26Morning {
//    Longest Unique Subarray (no peek)
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,1,51,2};
        int k = 3;
        int res = longestUniqueSubarray(arr, k);
        System.out.println(res);
    }
    static int longestUniqueSubarray(int[] arr, int k){
        int[] freq = new int[1001];
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < k; right++) {
            freq[arr[right]]++;
            while (freq[arr[right]]>1){
                freq[arr[left]]--;
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
