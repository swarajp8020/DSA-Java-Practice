package Practice.Week7Practice;

public class Dec14Morning {
/// LongestSubarrayKDistinct
    static void main() {
        int[] arr = {1,2,1,2,3,4,4,5};
        int k = 2;
        System.out.println(longestSubarrayK(arr,k));
    }
    static int longestSubarrayK(int[] arr, int k){
        int[] temp = new int[1001];
        int left =0,unique =0, maxLen =0;
        for (int right = 0; right < arr.length; right++) {
            if (temp[arr[right]]==0) unique++;
            temp[arr[right]]++;
            while (unique>k){
                temp[arr[left]]--;
                if (temp[arr[left]]==0)unique--;
                left++;
            }
            if (unique==k){
                maxLen=Math.max(maxLen,right-left+1);
            }
        }
        return maxLen;
    }
}
