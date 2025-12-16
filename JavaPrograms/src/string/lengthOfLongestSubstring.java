package string;
/// LC 3. Longest Substring Without Repeating Characters

class Solution {
    public int longestSubstring(String s){
        int[] freq = new int[128];
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq[c]++;
            while (freq[c] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}

public class lengthOfLongestSubstring {
    static void main(String[] args) {
        String s = "asvavsaffg";
        Solution solu = new Solution();
        System.out.println(solu.longestSubstring(s));
    }
}
